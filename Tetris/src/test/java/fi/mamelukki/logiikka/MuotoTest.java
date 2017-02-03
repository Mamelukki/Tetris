/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.mamelukki.logiikka;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author salmisar
 */
public class MuotoTest {

    private Tetrominot tetrominot;
    private Muoto muoto;

    public MuotoTest() {
        this.muoto = new Muoto();
    }

    @Before
    public void setUp() {
        this.muoto.setMuoto(tetrominot.KuutioPala);
    }

    @Test
    public void setMuotoAsettaaHalutunMuodon() {
        this.muoto.setMuoto(tetrominot.IPala);
        assertEquals(this.muoto.getPalanMuoto(), Tetrominot.IPala);
    }

    @Test
    public void getPalanMuotoPalauttaaOikeanMuodon() {
        assertEquals(this.muoto.getPalanMuoto(), Tetrominot.KuutioPala);
    }

    @Test
    public void setSatunnainenMuotoAsettaaSatunnaisenMuodon() {
        this.muoto.setSatunnainenMuoto();
    }
    
    @Test
    public void metodiKaannaVasemmalleKaantaaPalanVasemmalle() {
        this.muoto.kaannaVasemmalle();
    }

    @Test
    public void metodiKaantaaOikealleKaantaaPalanOikealle() {
        this.muoto.kaannaOikealle();
    }
}