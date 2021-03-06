
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import javax.swing.JOptionPane;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;
import java.util.*;  
import java.util.Properties;
import javax.activation.DataSource;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Simran
 */
public class frmDailyEntry extends javax.swing.JFrame {

     private static String FILE = "d:/simran/FirstPdf.pdf";
    private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18,
            Font.BOLD);
    private static Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 12,
            Font.NORMAL, BaseColor.RED);
    private static Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16,
            Font.BOLD);
    private static Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12,
            Font.BOLD);
    private JDatePickerImpl datePicker;
    JDatePanelImpl datePanel ;
     UtilDateModel model;
     Properties p;
    /**
     * Creates new form frmDailyEntry
     */
    public frmDailyEntry() {
        model = new UtilDateModel();
 p = new Properties();
p.put("text.today", "Today");
p.put("text.month", "Month");
p.put("text.year", "Year");
 datePanel = new JDatePanelImpl(model, p);
  datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
 datePicker.setBounds(170,70,150,30);
 add(datePicker);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbClientName = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbWeightGrp = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtAWB = new javax.swing.JTextField();
        txtTotWeight = new javax.swing.JTextField();
        txtForAWB = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cmbCountry = new javax.swing.JComboBox<>();
        cmbThru = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtZone = new javax.swing.JTextField();
        txtPcs = new javax.swing.JTextField();
        txtRateWeightGrp = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtConsignee = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        cmbClientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClientNameActionPerformed(evt);
            }
        });

        jLabel1.setText("ClientName");

        jLabel2.setText("Date ");

        jLabel3.setText("Weight Group");

        jLabel4.setText("AWB NO.");

        jLabel5.setText("FORW AWB");

        jLabel6.setText("DESTINATION");

        jLabel7.setText("THRU");

        txtForAWB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtForAWBActionPerformed(evt);
            }
        });

        jLabel8.setText("Total Weight");

        cmbCountry.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCountryItemStateChanged(evt);
            }
        });

        cmbThru.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DHL", "FEDEX" }));

        jLabel9.setText("Country Zone");

        jLabel10.setText("No. of pieces");

        jLabel11.setText("Rate Weight grp");

        jLabel12.setText("Amount");

        jLabel13.setText("Consignee");

        jButton1.setText("New");

        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtZone, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTotWeight, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                    .addComponent(txtForAWB))
                                .addComponent(txtAWB, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbWeightGrp, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbThru, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtPcs)
                            .addComponent(txtRateWeightGrp)
                            .addComponent(txtAmount)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(32, 32, 32)
                        .addComponent(txtConsignee))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jButton1)
                        .addGap(40, 40, 40)
                        .addComponent(jButton2)))
                .addGap(666, 666, 666))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbWeightGrp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAWB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtForAWB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtTotWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cmbCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtZone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtPcs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtRateWeightGrp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtConsignee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addComponent(cmbThru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    void FillClients()
    {
       try
        {
    Connection con=OracleConnection.getConnection();
    Statement stmt=con.createStatement();  
//step4 execute query  
     ResultSet rs=stmt.executeQuery("select * from Client order by FirmName");  
     cmbClientName.addItem("Select Clients");
     while(rs.next())
     {
         String FirmName= rs.getString("FirmName");
     cmbClientName.addItem(FirmName);
     }
     
    }
   
    catch(Exception e){ System.out.println(e+"client");}       
    } 
    
    void FillWeightGroup()
    {
       try
        {
    Connection con=OracleConnection.getConnection();
    Statement stmt=con.createStatement();  
//step4 execute query  
     ResultSet rs=stmt.executeQuery("select * from WeightGroup order by GroupId");  
     cmbWeightGrp.removeAllItems();
     cmbWeightGrp.addItem("Select Weight Group");
     while(rs.next())
     {
         String WeightGrp= rs.getString("WEIGHT");
     cmbWeightGrp.addItem(WeightGrp);
     }
     
    }
   
    catch(Exception e){ System.out.println(e+"weight");}       
    } 
    
    
    void FillCountry()
    {
       try
        {
    Connection con=OracleConnection.getConnection();
    Statement stmt=con.createStatement();  
//step4 execute query 
     ResultSet rs=stmt.executeQuery("select * from CountryZone order by Country");  
    cmbCountry.removeAllItems();
     cmbCountry.addItem("Select Country");
     if(rs!=null)
     {
     while(rs.next())
     {
         String Country= rs.getString("Country");
     cmbCountry.addItem(Country);
     }
     
    }
        }
    catch(Exception e){ 
       System.out.println(e);
       }       
    } 
    
    
    String getCountryZone(String country)
    {
    String zone=null;
       try
       {
       Connection con=OracleConnection.getConnection();
       Statement stmt=con.createStatement();
       ResultSet rs=stmt.executeQuery("select zone from countryzone where country='"+country+"'");
       if(rs.next())
       {
       zone=rs.getString("zone");
       }
       
       }
       catch(Exception e)
       {
       System.out.println(e);
       }
    return (zone);
    }
    
    private void cmbClientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbClientNameActionPerformed

    private void txtForAWBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtForAWBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtForAWBActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
         FillCountry();
        FillClients();
        FillWeightGroup();
       
    }//GEN-LAST:event_formWindowOpened

    private void cmbCountryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCountryItemStateChanged
        // TODO add your handling code here:
        if(!cmbCountry.getSelectedItem().toString().contains("Select Country"))
        {
        String country=cmbCountry.getSelectedItem().toString();
        String WeightGrp=cmbWeightGrp.getSelectedItem().toString();
        String ClientName=cmbClientName.getSelectedItem().toString();
        String zone=getCountryZone(country);   
        txtZone.setText(zone);
        int ClientId=getClientId(ClientName);
        double rate=getRate(ClientId,zone,WeightGrp);
        txtRateWeightGrp.setText(String.valueOf(rate));
        double totWeight=Double.parseDouble(txtTotWeight.getText());
        if(WeightGrp.contains("-"))
        {
        double Amount=rate*totWeight;
        txtAmount.setText(String.valueOf(Amount));
        }
        else
            txtAmount.setText(String.valueOf(rate));
        }
    }//GEN-LAST:event_cmbCountryItemStateChanged
 void sendEmail(String EmailFrom, String EmailTo, String Message, String Subject,String Filepath)
  {
       Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");

		Session session = Session.getDefaultInstance(props,
			new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication("khanaziza302@gmail.com","9812134800");
				}
			});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(EmailFrom));
			message.setRecipients(RecipientType.TO,
					InternetAddress.parse(EmailTo));
			message.setSubject(Subject);
			message.setText(Message);
                        
                        BodyPart messageBodyPart=new MimeBodyPart();
                       messageBodyPart.setText(Message);
                       Multipart multipart=new MimeMultipart();
                       multipart.addBodyPart(messageBodyPart);
                       messageBodyPart=new MimeBodyPart();
                      // messageBodyPart.attachFile(new File(Filepath));
                      // messageBodyPart.setHeader("Content-Type", "text/plain; charset=\"us-ascii\"; name=\"Filepath\"");

                      FileDataSource dataSource = new FileDataSource(new File(Filepath));
                      //DataSource source=new FileDataSource(Filepath);
                       messageBodyPart.setDataHandler(new DataHandler(dataSource));
		messageBodyPart.setFileName("out.txt");
		//attachMent.setDisposition(MimeBodyPart.ATTACHMENT);
		messageBodyPart.setDisposition(MimeBodyPart.INLINE);
                       multipart.addBodyPart(messageBodyPart);
                       message.setContent(multipart);
                       message.saveChanges();
			Transport.send(message);

			System.out.println("Done");

		} catch (MessagingException e) {
                    System.out.println(e);
		}
	
  }
  
  String  getEmailId(int id)
  {
      String Email=null;
   try
    {
        
    Connection con= OracleConnection.getConnection();
    Statement stmt=con.createStatement();
    ResultSet rs=stmt.executeQuery("select Email from Client where  clientid="+id);
    if(rs.next())
    {
    Email=rs.getString(1);
    }
    }
    catch(Exception e)
    {
    System.out.println(e);
    }
    return Email;
  }
  
     int GetDailyEntryId()
    {
        int id=1;
         try{  
//step1 load the driver class  
Class.forName("oracle.jdbc.driver.OracleDriver");  
  
//step2 create  the connection object  
Connection con=DriverManager.getConnection(  
"jdbc:oracle:thin:@localhost:1521:xe","simran","12345");  
//step3 create the statement object  
Statement stmt=con.createStatement();  
//step4 execute query  
ResultSet rs=stmt.executeQuery("select * from DailyEntry order by DailyEntryId  Desc");  
if(rs.next()) 
{
    id = rs.getInt("DailyEntryId");
     id=id+1;
}
    }
    catch(Exception e){ System.out.println(e);}       
         
         return(id);

    }
     
     
     int getClientID(String ClientName)
    {
        int cid=0;
    try{  
//step1 load the driver class  
Class.forName("oracle.jdbc.driver.OracleDriver");  
  
//step2 create  the connection object  
Connection con=DriverManager.getConnection(  
"jdbc:oracle:thin:@localhost:1521:xe","simran","12345");  
//step3 create the statement object  
Statement stmt=con.createStatement();  
//step4 execute query  
ResultSet rs=stmt.executeQuery("select ClientId from Client where FirmName ='"+ClientName+"'");  
if(rs.next()) 
{
    cid = rs.getInt("ClientId");
     
}
    }
    catch(Exception e){ System.out.println(e);}       
         
         return(cid);
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        try{  
                      
        Connection con=OracleConnection.getConnection();
        int DailyEntryId =GetDailyEntryId() ;
       String WeightGroup= cmbWeightGrp.getSelectedItem().toString();
        String Zone;
        int ClientId =getClientId(cmbClientName.getSelectedItem().toString());
        Date jStartDate =  (Date) datePicker.getModel().getValue() ; //your "java" date object
        java.sql.Date startDate = new java.sql.Date(jStartDate.getTime());
        System.out.println(startDate);
          if(con!=null)
  {
PreparedStatement stmt=con.prepareStatement("Insert into DailyEntry values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");  
stmt.setInt(1,DailyEntryId);//1 specifies the first parameter in the query  
stmt.setString(2,txtAWB.getText());  
stmt.setString(3,txtForAWB.getText());    
stmt.setString(4,cmbThru.getSelectedItem().toString());    
stmt.setString(5,cmbCountry.getSelectedItem().toString());    
stmt.setString(6,txtZone.getText());
stmt.setString(7,txtTotWeight.getText());    
stmt.setString(8,txtPcs.getText());  
stmt.setInt(9,ClientId);  
stmt.setString(10,WeightGroup);  
stmt.setString(11,txtRateWeightGrp.getText());  
stmt.setString(12,txtAmount.getText());  
stmt.setString(13,txtConsignee.getText());  
stmt.setDate(14,startDate); 
stmt.setString(15,"new"); 
int i=stmt.executeUpdate();  
if(i>0)
{
JOptionPane.showMessageDialog(rootPane,"Daily Entry Add Sucessfully");
        String EmailFrom="khanaziza302@gmail.com";
        String EmailTo =getEmailId(ClientId);
        String Message ="You Booking has been made for the following Items  AWBNO"+txtAWB.getText() +" FORAWB# "+ txtForAWB.getText()+ " Toatal Weight :  " + txtTotWeight.getText() + " Amounting  Rs :" + txtAmount.getText();
        String Subject = "Booking Details";
        String out=new SimpleDateFormat("yyyy-MM-dd hh-mm-ss'.pdf'").format(new Date());
        out="d:\\simran\\"+out;
        createPdf(out,String.valueOf(DailyEntryId));
        sendEmail(EmailFrom,EmailTo,Message,Subject,out);
}
else
JOptionPane.showMessageDialog(rootPane,"Daily Entry Allready Exist");    
       }
       
           }catch(Exception e){ System.out.println(e);}  
                                             

    }//GEN-LAST:event_jButton2ActionPerformed

    
     public void createPdf(String dest,String id) throws IOException, DocumentException {
             
         try
         {
        
        Font smallfont = new Font(Font.FontFamily.HELVETICA, 10);
        Document document = new Document(PageSize.A4, 5, 5, 5, 5);
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(dest));
        document.open();
        //PdfPTable table = new PdfPTable(2);
        
        PdfContentByte cb = writer.getDirectContent();
       Connection con=OracleConnection.getConnection();
    Statement stmt=con.createStatement();  
//step4 execute query  
Vector<String> columnNames = new Vector<String>();
ResultSet rs=stmt.executeQuery("select * from dailyEntry where dailyEntryId='"+id+"'");  
// String[] columnNames = {"ZoneId","Country", "Zone"};
 
  if (rs != null) {
        ResultSetMetaData columns = rs.getMetaData();
    String clientName=cmbClientName.getSelectedItem().toString();
  int clientId=getClientId(clientName);
  Date jStartDate =  (Date) datePicker.getModel().getValue() ; //your "java" date object
        java.sql.Date startDate = new java.sql.Date(jStartDate.getTime());
      PdfPTable table = new PdfPTable(columns.getColumnCount());
       table.setTotalWidth(PageSize.A4.getWidth());
        table.setLockedWidth(true);
      int k=1;
      while(k<=columns.getColumnCount())
      {
        PdfPCell c1 = new PdfPCell(new Phrase(columns.getColumnName(k)));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);
        k++;
      }
    
        table.setHeaderRows(1); 
          
        while(rs.next()) 
        {
           
                
        table.addCell(id);
        table.addCell(txtAWB.getText());
        table.addCell(txtForAWB.getText());
        table.addCell(cmbThru.getSelectedItem().toString());
        table.addCell(cmbCountry.getSelectedItem().toString());
        table.addCell(txtZone.getText());
        table.addCell(txtTotWeight.getText());
        table.addCell(txtPcs.getText());
        table.addCell(String.valueOf(clientId));
        table.addCell(cmbWeightGrp.getSelectedItem().toString());
        table.addCell(txtRateWeightGrp.getText());
        table.addCell(txtAmount.getText());
        table.addCell(txtConsignee.getText());
        table.addCell(String.valueOf(startDate));
        }
        Paragraph subPara = new Paragraph("From", subFont);
        String Client="ADL WorldWide";
        String Address="21 New Ram Nagar Panipat";
        String Email="sushilsaini04@gmail.com";
        String Phone="(9896470047";
        subPara.add(new Paragraph(Client));
        subPara.add(new Paragraph(Address));
        subPara.add(new Paragraph(Email));
        subPara.add(new Paragraph(Phone));
        Paragraph subParaTo = new Paragraph("To", subFont);
        String Client1="Saini Technologies";
        String Address1="21 New Ram Nagar Panipat";
        String Email1="sushilsaini04@gmail.com";
        String Phone1="(9896470047";
        subParaTo.add(new Paragraph(Client));
        subParaTo.add(new Paragraph(Address));
        subParaTo.add(new Paragraph(Email));
        subParaTo.add(new Paragraph(Phone));
         document.add(subPara);
         document.add(subParaTo);
         document.add(table);
        document.close();
  }
         }
          catch(Exception e){ System.out.println(e);}   
    }

    int getClientId(String ClientName)
    {
    int cid=0;
    try
    {
    Connection con=OracleConnection.getConnection();
    Statement stmt=con.createStatement();
    ResultSet rs=stmt.executeQuery("select clientid from client where firmname='"+ClientName+"'");
    if(rs.next())
    {
    cid=rs.getInt("clientId");
    }
    con.close();
    }
    catch(Exception e)
    {
    System.out.println(e);
    }
    return cid;
    }
    
    double getRate(int clientId,String zone,String WeightGrp)
    {
    double rate=0;
    try
    {
    Connection con=OracleConnection.getConnection();
    Statement stmt=con.createStatement();
    ResultSet rs=stmt.executeQuery("select zone"+zone+" from zonerates where clientid="+clientId+" and weightgroup='"+WeightGrp+"'");
    if(rs.next())
    {
    rate=rs.getInt(1);
    }
    }
    catch(Exception e)
    {
    System.out.println(e);
    }
    return rate;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmDailyEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDailyEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDailyEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDailyEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDailyEntry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbClientName;
    private javax.swing.JComboBox<String> cmbCountry;
    private javax.swing.JComboBox<String> cmbThru;
    private javax.swing.JComboBox<String> cmbWeightGrp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAWB;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtConsignee;
    private javax.swing.JTextField txtForAWB;
    private javax.swing.JTextField txtPcs;
    private javax.swing.JTextField txtRateWeightGrp;
    private javax.swing.JTextField txtTotWeight;
    private javax.swing.JTextField txtZone;
    // End of variables declaration//GEN-END:variables
}
