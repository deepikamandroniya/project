                               /*unit conversion */

import java.util.Scanner;

//convert the unit of fundamental quantity: mass,temperature,time,currency,length:
public class unit {
    public void quantity() {

      //for selecting the quantities:
        System.out.println("welcome to unit conversion!!\n");
        System.out.println("\tplease select the quantity you want to convert\n");
        System.out.println("Mass(m) , Currency(C) , Temperature(T) ,Time(t) , Length(L) \n");
        try (Scanner sc = new Scanner(System.in)) {
            String quantity = sc.next();

            //if mass(m) quantity were select:
            if (quantity.equals("m")) {
                System.out.println("welcome to mass conversion!!\n");
                System.out.println("\tplease choose :\n 1 for getkilogram\n 2 for getgram\n");
                int mass = sc.nextInt();

                // gram converted in kilogram
                if (mass == 1) {
                    System.out.println("enter the value in gram to get kilogram :\n");
                    double gram = sc.nextDouble();
                    double kilogram = gram / 1000;
                    System.out.println("the conversion of gram to get in kilogram is \n" + kilogram);

                }

                // kilogram converted in gram
                else if (mass == 2) {
                    System.out.println("enter the value in kilogram to get in gram :\n");
                    double kilograms = sc.nextDouble();
                    double grams = kilograms * 1000;
                    System.out.println("the conversion of kilogram to get in gram is \n" + grams);
                }

                }


            //if currency(C) quantity were select:
            if (quantity.equals("C")) {
                System.out.println("welcome to currency conversion !!\n");
                System.out.println("\tplease choose :\n 1 for getmillion\n 2 for getcrores\n");
                int currency = sc.nextInt();

                // crores converted in million
                if (currency == 1) {
                    System.out.println("enter value in crores for conversion in million :\n");
                    double crores = sc.nextDouble();
                    double million = crores / 0.1;
                    System.out.println("the conversion of crores's in million is \n" + million);
                }

                // millions converted in crores
                else if (currency == 2) {
                    System.out.println("enter the value in million for conversion in crores :\n");
                    double millions = sc.nextDouble();
                    double crores = 10 * millions;
                    System.out.println("the conversion of million in crores is \n" + crores);
                }

            }

            //if temperature(T) quantity were select:
            if (quantity.equals("T")) {
                System.out.println("welcome to temperature conversion!!  \n");
                System.out.println("\tplease choose :\n 1 for getkelvin \n 2 for getcelcius\n");
                int temperature = sc.nextInt();

                // celcius converted in kelvin
                if (temperature == 1) {
                    System.out.println("enter the value in celcius to get in kelvin :\n");
                    double celcius = sc.nextDouble();
                    double kelvin = celcius + 273.15;
                    System.out.println("the conversion of celcius in kelvin is \n" +kelvin);

                }

                // kelvin converted in celcius
                else if(temperature==2){
                    System.out.println("enter the value in kelvin to get in celcius :\n");
                    double kelvin=sc.nextDouble();
                    double celcius =kelvin-273.15;
                    System.out.println("the conversion of kelvin in celcius is \n" +celcius);
                }
            }

            //if time(t) quantity were select:
                if (quantity.equals("t")) {
                    System.out.println("welcome to the time conversion !! \n");
                    System.out.println(" \tplease choose :  \n 1 for gethours \n 2 for getsecond \n");
                    int time = sc.nextInt();

                    // seconds converted in hours
                    if (time == 1) {
                        System.out.println("enter the value in seconds to get in hours :\n");
                        double seconds = sc.nextDouble();
                        double hours = seconds / 3600;
                        System.out.println("the conversion of seconds in hours  is \n" +hours);
                    }

                    // hours converted in seconds
                   else  if (time == 2) {
                        System.out.println("enter the value in hours to get in seconds : \n");
                        double hours = sc.nextDouble();
                        double seconds = hours * 3600;
                        System.out.println("the conversion of  hours  in seconds is \n" +seconds);
                    }
                }

            //if length(L) quantity were select:
                if(quantity.equals("L")) {
                    System.out.println("welcome to length conversion !!\n");
                    System.out.println("\t please choose :\n 1 for getkilometer\n 2 for getmeter\n");
                    int length = sc.nextInt();

                    // meter converted in kilometer
                    if (length == 1) {
                        System.out.println("enter the value in meter to get in kilometer :\n");
                        double meter = sc.nextDouble();
                        double kilometer = meter / 1000;
                        System.out.println("the conversion of meter in kilometer is \n" +kilometer);
                    }

                    // kilometer converted in meter
                    else if (length == 2) {
                        System.out.println("enter the value in kilometer to get in meter :\n");
                        double kilometer = sc.nextDouble();
                        double meter = kilometer * 1000;
                        System.out.println("the conversion of kilometer in meter is \n" +meter);
                    }
                }
        }
    }


                public static void main(String[] args) {
                    
        // 10 objects(functions) are:
                    unit kg = new unit();  //kg(kilogram) unit of mass
                    unit g = new unit(); //g(gram) unit of mass
                    unit M=new unit();  //M(million) unit of currency
                    unit cr=new unit(); //cr(crore) unit of currency
                    unit K=new unit();  //K(kelvin) unit of temperature
                    unit C=new unit();  //C(celsius) unit of temperature
                    unit hr=new unit(); //hr(hours) unit of time
                    unit s=new unit();  //s(seconds) unit of time
                    unit km=new unit(); //km(kilometer)  unit of length
                    unit m=new unit();  //m (meter) unit of length

                    // object call:
                    kg.quantity();
                    g.quantity();
                    M.quantity();
                    cr.quantity();
                    K.quantity();
                    C.quantity();
                    hr.quantity();
                    s.quantity();
                    km.quantity();
                    m.quantity();


                }
            }
                                                 /*END OF CODE*/



