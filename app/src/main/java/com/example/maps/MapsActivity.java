package com.example.maps;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);


        //rhon
        LatLng ucnhs = new LatLng(15.9787, 120.5632);
        LatLng home = new LatLng(15.990323, 120.545356);
        LatLng ucu = new LatLng(15.9806, 120.5606);
        LatLng bypass = new LatLng(15.984408, 120.555764);

        //heaven
        LatLng qma = new LatLng(15.9240, 120.8403); //Quezon Memorial Academy 15.9240° N, 120.8403°
        LatLng house = new LatLng(15.9191, 120.8093);
        LatLng balu = new LatLng(15.897519, 120.672308);
        LatLng vil = new LatLng(15.900305, 120.588277);
        LatLng urd = new LatLng(15.970787, 120.571587);
        LatLng ucu2 = new LatLng(15.9806, 120.5606);

        //via
        LatLng avr = new LatLng(15.975840, 120.567207); //Angela Valdez Ramos National High School
        LatLng bahay = new LatLng(16.001990, 120.669190);
        LatLng asi = new LatLng(15.9806, 120.5606);
        LatLng ucu3 = new LatLng(15.9806, 120.5606);




        //rhon
        mMap.addMarker(new MarkerOptions().position(ucnhs).title("Marker in Urdaneta City National High School").snippet("Rhonniel Bagaoisan").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
        mMap.addMarker(new MarkerOptions().position(home).title("Marker in Home").snippet("Rhonniel Bagaoisan").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
        mMap.addMarker(new MarkerOptions().position(ucu).title("Marker in UCU").snippet("Rhonniel Bagaoisan").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
        mMap.addMarker(new MarkerOptions().position(bypass).title("Marker in Bypass").snippet("Rhonniel Bagaoisan").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ucnhs));

        //heaven
        mMap.addMarker(new MarkerOptions().position(qma).title("Marker in Quezon Memorial Academy").snippet("Heaven Goldie A. Quirimit").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.addMarker(new MarkerOptions().position(house).title("Marker in House").snippet("Heaven Goldie A. Quirimit").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.addMarker(new MarkerOptions().position(balu).title("Marker in Balungao").snippet("Heaven Goldie A. Quirimit").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.addMarker(new MarkerOptions().position(vil).title("Marker in Villasis").snippet("Heaven Goldie A. Quirimit").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.addMarker(new MarkerOptions().position(urd).title("Marker in Urdaneta").snippet("Heaven Goldie A. Quirimit").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.addMarker(new MarkerOptions().position(ucu2).title("Marker in UCU").snippet("Heaven Goldie A. Quirimit").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

        //via
        mMap.addMarker(new MarkerOptions().position(avr).title("Marker in Angela Valdez Ramos National High School").snippet("Via Rotsen D. Umalla").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        mMap.addMarker(new MarkerOptions().position(bahay).title("Marker in House").snippet("Via Rotsen D. Umalla").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        mMap.addMarker(new MarkerOptions().position(asi).title("Marker in Asingan").snippet("Via Rotsen D. Umalla").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        mMap.addMarker(new MarkerOptions().position(ucu3).title("Marker in UCU").snippet("Via Rotsen D. Umalla").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));



        //Rhon
        mMap.addCircle(new CircleOptions()
                .center(new LatLng(15.990323, 120.545356))
                .radius(1000)
                .strokeWidth(10)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 0, 255, 0)));


        mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(15.990323, 120.545356), //home
                        new LatLng(15.984408, 120.555764), //bypass
                        new LatLng(15.9806,120.5606)) //ucu
                .width(10)
                .color(Color.CYAN));



        //heaven
        mMap.addCircle(new CircleOptions()
                .center(new LatLng(15.9191, 120.8093))
                .radius(1000)
                .strokeWidth(10)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 0, 255, 0)));


        mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(15.9191, 120.8093), //home
                        new LatLng(15.897519, 120.672308), //balungao
                        new LatLng(15.900305, 120.588277), //villasis
                        new LatLng(15.970787, 120.571587), //urdaneta
                        new LatLng(15.9806,120.5606)) //ucu
                .width(10)
                .color(Color.YELLOW));



        //via
        mMap.addCircle(new CircleOptions()
                .center(new LatLng(16.001990, 120.669190))
                .radius(1000)
                .strokeWidth(10)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 0, 255, 0)));


        mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(16.001990, 120.669190), //home
                        new LatLng(15.9806, 120.5606), //asingan
                        new LatLng(15.9806,120.5606)) //ucu
                .width(10)
                .color(Color.MAGENTA));



        mMap.addPolygon(new PolygonOptions()
                .add(new LatLng(15.990323, 120.545356),  //rhon's home
                        new LatLng(15.9191, 120.8093), //heaven's  home
                        new LatLng(16.001990, 120.669190))    //via's home
                .strokeColor(Color.WHITE)
                .fillColor(Color.argb(128, 255, 0, 0)));


    }
}