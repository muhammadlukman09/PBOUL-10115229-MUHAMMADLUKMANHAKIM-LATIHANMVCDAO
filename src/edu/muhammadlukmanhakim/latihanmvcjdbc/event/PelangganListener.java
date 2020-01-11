/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.muhammadlukmanhakim.latihanmvcjdbc.event;

import edu.muhammadlukmanhakim.latihanmvcjdbc.entity.Pelanggan;
import edu.muhammadlukmanhakim.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author lukman
 * Nim      : 10115229
 * Nama     : Muhammad Lukman Hakim
 * Kelas    : PBO ULANG
 */
public interface PelangganListener {
    
    public void onChange(PelangganModel model);
    
    public void onInsert(Pelanggan pelanggan);
    
    public void onDelete();
    
    public void onUpdate(Pelanggan pelanggan);
}
