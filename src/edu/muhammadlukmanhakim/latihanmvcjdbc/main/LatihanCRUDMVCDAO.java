/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.muhammadlukmanhakim.latihanmvcjdbc.main;

import edu.muhammadlukmanhakim.latihanmvcjdbc.database.KingBarbershopDatabase;
import edu.muhammadlukmanhakim.latihanmvcjdbc.entity.Pelanggan;
import edu.muhammadlukmanhakim.latihanmvcjdbc.error.PelangganException;
import edu.muhammadlukmanhakim.latihanmvcjdbc.service.PelangganDao;
import edu.muhammadlukmanhakim.latihanmvcjdbc.view.MainViewPelanggan;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *
 * @author lukman
 * Nim      : 10115229
 * Nama     : Muhammad Lukman Hakim
 * Kelas    : PBO ULANG
 */
public class LatihanCRUDMVCDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException{ {
        // TODO code application logic here
        
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try{
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                    
                    
                } catch (PelangganException ex) {
                    Logger.getLogger(LatihanCRUDMVCDAO.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(LatihanCRUDMVCDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
               
            }
        }){
        
        
    }
        }
        
        
        
        
        
        
       
    }
    
}


