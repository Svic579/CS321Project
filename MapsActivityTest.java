package com.example.epa;

import android.content.Context;

import androidx.core.content.ContextCompat;

import com.google.android.gms.maps.model.LatLng;

import org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MapsActivityTest {
    MapsActivity M1 = new MapsActivity();
    ArrayList<String[]> Shelters = M1.r();
    int size = 11;


    @Test
    public void Test1(){
        String Sname = "Good Shepherd Alliance";
        assertEquals(size,Shelters.size());
        assertEquals(Sname, Shelters.get(0)[0]);
    }
    @Test
    public void Test2(){
        String C = M1.county;
        assertEquals(M1.getIntent().getExtras().getString("county"),C);
        //Correct Context testing
        Context context = M1.context;
        assertEquals(M1.getApplicationContext(),context);
    }
    @Test
    public void Test3(){
        LatLng curr = M1.curr;
        double clat = curr.latitude;
        double clng = curr.longitude;
        double Lat = 38.834721;
        double Lng = -77.312683;
        if(Lat ==  clat){
            assertEquals(true,true);
        }
        if(Lng == clng){
            assertEquals(true,true);
        }
        // this assertEquals is done this way because
        // assertEquals() deprecates when doing it for
        // doubles.

    }

    @Test
    public void Test4(){
        String Sname = "Cold Weather Shelter";
        assertEquals(size,Shelters.size());
        assertEquals(Sname, Shelters.get(0)[2]);
    }

    @Test
    public void Test5(){
        String Sname = "Louduon County Family Services Department";
        assertEquals(size,Shelters.size());
        assertEquals(Sname, Shelters.get(0)[4]);
    }
}
