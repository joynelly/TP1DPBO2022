/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datalibrary;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
//import java.awt.Image;
//import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
//import java.io.IOException;
//import java.net.URL;
//import javax.imageio.ImageIO;


/**
 *
 * @author Asus
 */
public class dbConnection {
    public static Connection con;
    public static Statement stm;
    
    public void connect(){//untuk membuka koneksi ke database
        try {
            String url ="jdbc:mysql://localhost/dbtp1";
            String user="root";
            String pass="";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,user,pass);
            stm = con.createStatement();
            System.out.println("koneksi berhasil;");
        } catch (Exception e) {
            System.err.println("koneksi gagal" +e.getMessage());
        }
    }
    
    public void readData(){
        
        try{
            String sql = "Select * from tb_author";
            ResultSet res = stm.executeQuery(sql);

            int no = 1;
            while(res.next()){
                Object[] hasil = new Object[3];
                hasil[0] = no;
                hasil[1] = res.getString("nama");
                hasil[2] = res.getString("jlh_buku");
                no++;
                System.out.println(hasil[1]);
            }
        }catch(Exception e){
            System.err.println("Read gagal1 " +e.getMessage());
        }
    }
    
    
    public DefaultTableModel readTable(){
        
        DefaultTableModel dataTabel = null;
        //dataTabel.setRowHeight(120);
        //dataTabel.getColumnModel().getColumn(4).setPreferredWidth(150);
        try{
            Object[] column = {"Id", "Nama", "Jumlah", "Image"};
            connect();
            dataTabel = new DefaultTableModel(null, column);
            String sql = "Select * from tb_author";
            ResultSet res = stm.executeQuery(sql);
            
            int no = 1;
            while(res.next()){
                Object[] hasil = new Object[4];
                hasil[0] = res.getInt("id_author");
                hasil[1] = res.getString("nama");
                hasil[2] = res.getInt("jlh_buku");
                //image = ImageIO.read(url);
                /*byte image[] = res.getBytes("img");
                if(image != null) {
                    //ImageIcon images = new ImageIcon(new ImageIcon(image).getImage().getScaledInstance(150,120, Image.SCALE_SMOOTH));
                    //hasil[3] = images;
                    URL url = new URL(res.getString("url_img"));
                    Image img = ImageIO.read(url);
                    ImageIcon images = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(150, 120, Image.SCALE_SMOOTH));
                    hasil[3] = images;
                }*/
                hasil[3] = res.getBytes("img");
                no++;
                System.out.print(hasil[1]);
                dataTabel.addRow(hasil);
            }
        }catch(Exception e){
            System.err.println("Read gagal2 " +e.getMessage());
        }
        
        return dataTabel;
    }
    
    public DefaultTableModel readTable2(){
        
        DefaultTableModel dataTabel = null;
        try{
            Object[] column = {"Id_buku", "Judul", "Penerbit", "Author", "Cover", "Desc"};
            connect();
            dataTabel = new DefaultTableModel(null, column);
            String sql = "Select * from tb_buku";
            ResultSet res = stm.executeQuery(sql);
            
            int no = 1;
            while(res.next()){
                Object[] hasil = new Object[6];
                hasil[0] = res.getString("id_buku");
                hasil[1] = res.getString("judul");
                hasil[2] = res.getString("penerbit");
                hasil[3] = res.getString("author");
                //image = ImageIO.read(url);
                /*byte image[] = res.getBytes("img");
                if(image != null) {
                    //ImageIcon images = new ImageIcon(new ImageIcon(image).getImage().getScaledInstance(150,120, Image.SCALE_SMOOTH));
                    //hasil[3] = images;
                    URL url = new URL(res.getString("url_img"));
                    Image img = ImageIO.read(url);
                    ImageIcon images = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(150, 120, Image.SCALE_SMOOTH));
                    hasil[3] = images;
                }*/
                hasil[5] = res.getString("desc");
                hasil[4] = res.getBytes("cover");
                no++;
                System.out.print(hasil[1]);
                dataTabel.addRow(hasil);
            }
        }catch(Exception e){
            System.err.println("Read gagal2 " +e.getMessage());
        }
        
        return dataTabel;
    }
    
    
    public void Query(String inputan){
        
        try{
            connect();
            String sql = inputan;
            stm.execute(sql);
            
        }catch(Exception e){
            System.err.println("Read gagal " +e.getMessage());
        }
        
    }
}
