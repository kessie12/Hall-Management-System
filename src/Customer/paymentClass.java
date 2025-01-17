/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *
 * @author xuen_
 */
public class paymentClass {
    private String paymentID;
    private String bookingID;
    private double price;
    private String paymentDate;
    private String paymentMethod;
    
    
    // constructor
    public paymentClass(String paymentID, String bookingID, double price, String paymentDate, String paymentMethod) {
        this.paymentID = paymentID;
        this.bookingID = bookingID;
        this.price = price;
        this.paymentDate = paymentDate;
        this.paymentMethod = paymentMethod;
    }
    
    public paymentClass() {
        
    }
    
    // getters method
    public String getPaymentID() {
        return paymentID;
    }
    
    public String getBookingID() {
        return bookingID;
    }
    
    public double getPrice() {
        return price;
    }
    
    public String getPaymentDate() {
        return paymentDate;
    }
    
    public String getPaymentMethod() {
        return paymentMethod;
    }
    
    // setters method
    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }
    
    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }
    
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    
    // display receipt method
    public void displayReceipt(String email, String selectedPaymentMethod) {
        this.paymentDate = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());
        this.paymentMethod = selectedPaymentMethod;
        extractBooking(email);
        this.paymentID = generatePaymentID();
        
        //display receipt
        JOptionPane.showMessageDialog(null, "Official Receipt\n" + 
                "Payment ID: " + this.paymentID + "\n" + 
                "Booking ID: " + this.bookingID + "\n" +
                "Price: RM" + this.price + "\n" + 
                "Payment Date: " + this.paymentDate + "\n" + 
                "Payment Method: " + this.paymentMethod + "\n", "Receipt", JOptionPane.INFORMATION_MESSAGE);
        
        JFileChooser file = new JFileChooser();
        file.setDialogTitle("Save Receipt as PDF");
        file.setFileFilter(new FileNameExtensionFilter("PDF documents", "pdf"));
        
        int select = file.showSaveDialog(null);
        
        if (select == JFileChooser.APPROVE_OPTION) {
            try{
                // save file at selected path
                String path = file.getSelectedFile().getAbsolutePath();
                
                // make sure its a pdf file 
                if (!path.endsWith(".pdf")) {
                    path += ".pdf";
                }
                
                PdfWriter writer = new PdfWriter(path);
                PdfDocument pdf = new PdfDocument(writer);
                Document document = new Document(pdf);
                
                document.add(new Paragraph("Official Receipt"));
                document.add(new Paragraph("Payment ID: " + this.paymentID));
                document.add(new Paragraph("Booking ID: " + this.bookingID));
                document.add(new Paragraph("Price: RM" + this.price));
                document.add(new Paragraph("Payment Date: " + this.paymentDate));
                document.add(new Paragraph("Payment Method: " + this.paymentMethod));
                
                document.close();
                
                JOptionPane.showMessageDialog(null, "Recipt saved at: " + path, "Success", JOptionPane.INFORMATION_MESSAGE);
                
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error saving receipt: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        try{
            FileWriter fw = new FileWriter("payment.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write(this.paymentID + ";" + this.bookingID + ";" + this.price + ";" + this.paymentDate + ";" + this.paymentMethod + "\n");
            bw.flush();
        } catch (IOException e) {
            System.out.println("Error writing to payment.txt" + e.getMessage());
        }
    }
    
    private void extractBooking(String email) {
        try{
            FileReader fr = new FileReader("booking.txt");
            BufferedReader br = new BufferedReader(fr);
            String read;
            String booking = null;
            
            while ((read = br.readLine()) != null) {
                String[] details = read.split(";");
                if (details[1].equals(email)) {
                    booking = read;
                }
            }
            
            if (booking != null) {
                String[] details = booking.split(";");
                this.bookingID = details[0];
                this.price = Double.parseDouble(details[6]);
            }
        } catch (IOException e) {
            System.out.println("Error reading booking.txt" + e.getMessage());
        }
    }
    
    private String generatePaymentID() {
        String paymentIDPrefix = "P";
        int lastNumber = 0;
        
        // check for highest number of Payment ID in payment.txt
        try{
            FileReader fr = new FileReader("payment.txt");
            BufferedReader br = new BufferedReader(fr);
            String read;
            
            while ((read = br.readLine()) != null) {
                String[] details = read.split(";");
                String currentPaymentID = details[0];
                
                if (currentPaymentID.startsWith(paymentIDPrefix)) {
                    // ccnvert to integer
                    int LastNumber = Integer.parseInt(currentPaymentID.substring(1));
                    
                    // update lastNumber if LastNumber is higher
                    if (LastNumber > lastNumber) {
                        lastNumber = LastNumber;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading payment.txt" + e.getMessage());
        }
        
        lastNumber++;
        
        return String.format("P%03d", lastNumber);
    }

   
    
    

}
