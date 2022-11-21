                                    /* unit conversion */

#include <stdio.h>
//10 users define funtions :
//convert the unit of fundamental quantity: mass,temperature,time,currency,length 

float getgram(float kilogram);   
float getkilogram(float gram);
float getmillion(float crores);
float getcrores(float million);
float getkelvin(float celcius);
float getcelcius(float kelvin);
float gethours(float seconds);
float getseconds(float hours);
float getkilometer(float meter);
float getmeter(float kilometer);

int main()
{
    //unit of mass
    float kilogram;
    float gram;
    //unit of currency
    float million;
    float crores;
    //unit of temperature
    float celcius;
    float kelvin;
    //unit of time
    float seconds;
    float hours;
    //unit of length
    float meter;
    float kilometer;
    //quantities:
    int temperature;
    int time;
    int length;
    int currency;
    int mass;

    char quantity;
    
   //for selecting the quantities:
    printf("welcome to unit conversion!!\n");
    printf("\tplease select the quantity you want to convert\n\n");
    printf("Mass(m) , Currency(C) , Temperature(T) ,Time(t) , Length(L) \n");
    scanf("%c", &quantity);

    //if mass(m) quantity were select:
     if(quantity=='m'){
        printf("welcome to unit conversion!!\n");
        printf("please choose :\n 1 for getkilogram\n 2 for getgram\n");
        scanf("%d",&mass);
     }
     if(mass==1)
{
    printf("enter the value in gram to get kilogram\n");
    scanf("%f",&gram);
    float getkilogram(float gram);
    printf("the conversion of gram in kilogram is %.3f\n",getkilogram(gram));
}    
else if(mass==2){
    printf("enter the value in kilogram to get in gram\n");
    scanf("%f",&kilogram);
    float getgram(float kilogram);
    printf("the conversion of kilogram to get in gram is %.3f", getgram(kilogram));

}
 //if currency(C) quantity were select:
    if(quantity=='C'){
        printf("welcome to currency conversion !!\n");
        printf("\tplease choose :\n 1 for getmillion\n 2 for getcrores\n");
        scanf("%d",&currency);
    }
    if(currency==1){
        printf("enter value in crores for conversion in million :\n");
        scanf("%f",&crores);     // crores converted in million
        float getmillion(float crores);
        printf("the conversion of crores's in million is %.3fM.\n",getmillion(crores));
    }
    else if (currency==2){
    printf("enter the value in million for conversion in crores :\n");
    scanf("%f",&million);          // millions converted in crores
    float getcrores(float million);
    printf("the conversion of million in crores is %.3fcr.\n",getcrores(million));

    }
    
     //if time(t) quantity were select:
    if(quantity=='t'){
        printf("welcome to the time conversion !!\n");
        printf("\tplease choose : \n 1 for gethours\n 2 for getsecond\n");
        scanf("%d",&time);

    }
    if (time==1){
        printf("enter the value in seconds to get in hours :\n");
        scanf("%f",&seconds);      // seconds converted in hours
        float gethours(float seconds);
        printf("the conversion of seconds in hours  is %.3fs.\n",gethours(seconds));

    }
    else if (time==2)
    {
        printf("enter the value in hours to get in seconds :\n");
        scanf("%f",&hours);          // hoursconverted in seconds
        float getseconds(float hours);
        printf("the conversion of  hours  in seconds is %.3fhr. \n",getseconds(hours));
    }

     //if length(L) quantity were select:
    if (quantity=='L'){
    printf("welcome to length conversion !!\n");
    printf("\tplease chosse :\n 1 for getkilometer\n 2 for getmeter\n");
    scanf("%d",&length);

    }
    if (length==1)
    {
        printf("enter the value in meter to get in kilometer :\n");
        scanf("%f",&meter);       // meter converted in kilometer
        float getkilometer(float meter);
        printf("the conversion of meter in kilometer is %.3fkm.\n",getkilometer(meter));

    }
    else if (length==2){
        printf("enter the value in kilometer to get in meter :\n");
        scanf("%f",&kilometer);    // kilometer converted in meter 
        float getmeter(float kilometer);
        printf("the conversion of kilometer in meter is %.3fm .\n", getmeter(kilometer));
    }
   
    if(quantity=='T'){
        printf("welcome to temperature conversion!!  \n");
        printf("\tplease choose :\n 1 for getkelvin \n 2 for getcelcius\n");
        scanf("%d",&temperature);

    }
     //if temperature(T) quantity were select:
    if(temperature==1){
        printf("enter the value in celcius to get in kelvin :\n");
        scanf("%f",&celcius);    // celcius converted in kelvin
        float getkelvin(float celcius);
        printf("the conversion of celcius in kelvin is %f.3K.\n", getkelvin(celcius));

    }
    else if (temperature==2)
    {
        printf("enter the value in kelvin to get in celcius :\n");
        scanf("%f",&kelvin);     // kelvin converted in celcius
        float getcelcius(float kelvin);
        printf("the conversion of kelvin in celcius is %.3f°C",getcelcius(kelvin));

    }

    return 0;
}

// function call;
float getkilogram(float gram){
    return (gram/1000);
}
float getgram(float kilogram){
    return kilogram*1000;
}
float getmillion(float crores){
    return crores/0.1 ;
}
float getcrores(float million){
    return 0.1*million;
}
float gethours(float seconds){
    return seconds/3600;
}
float getseconds(float hours){
    return hours*3600;
}
float getkilometer(float meter){
    return meter/1000;
}
float getmeter(float kilometer){
    return 1000*kilometer;
}
float getkelvin(float celcius){
    return celcius+273.15;
}
float getcelcius(float kelvin){
    return kelvin-273.15;
}

                                    /* END OF CODE*/