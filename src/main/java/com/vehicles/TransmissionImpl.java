/*
 *Author Name : Seetha Lakshmi.G.M
 *Date : 31-08-2022
 *Created With : IntelliJ IDEA Community Edition
 */


package com.vehicles;

public class TransmissionImpl {
    public static void main(String[] args) {
        Transmission manual = new Manual("Manual",
                "MP4",
                4,
                2.540,
                1.920,
                1.510,
                1.000);
        manual.showSpecs();
        System.out.println();
        Transmission manual1 = new Manual("Manual",
                "MP5",
                5,
                3.545,
                1.904,
                1.280,
                0.914,
                0.757);
        manual1.showSpecs();
        System.out.println();
        Transmission manual2 = new Manual("Manual",
                "MP6",
                6,
                3.010,
                2.070,
                1.430,
                1.000,
                0.710,
                0.570);
        manual2.showSpecs();
        System.out.println();
        Transmission manual3 = new Manual("Manual",
                "MD5",
                5,
                3.545,
                1.904,
                1.233,
                0.911,
                0.725);
        manual3.showSpecs();
        System.out.println();
        Transmission manual4 = new Manual("Manual",
                "MD6",
                6,
                3.640,
                2.150,
                1.360,
                1.000,
                0.750,
                0.630);
        manual4.showSpecs();
        System.out.println();
        Transmission automatic = new AMT("AMT",
                "AMTP4",
                4,
                2.540,
                1.920,
                1.510,
                1.000);
        automatic.showSpecs();
        System.out.println();
        Transmission automatic1 = new AMT("AMT",
                "AMTD5",
                5,
                2.950,
                1.940,
                1.340,
                1.000,
                0.630);
        automatic1.showSpecs();
        System.out.println();
        Transmission cvt = new AutomaticCVT("Automatic-CVT",
                "CVT6",
                6,
                2.631,
                1.440,
                1.165,
                0.906,
                0.680,
                0.499);
        cvt.showSpecs();
        System.out.println();
        Transmission dct = new AutomaticDCT("Automatic-DCT",
                "DCT8",
                8,
                4.714f,
                3.143f,
                2.106f,
                1.667f,
                1.285f,
                1.000f,
                0.839f,
                0.667f);
        dct.showSpecs();
    }
}
