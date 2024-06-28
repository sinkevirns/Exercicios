#include <Thermistor.h>

#define MAX_TIME 42
#define MIN_TIME 24

#define SIREN 3

Thermistor temp(0);

void setup()
{
Serial.begin(9600);
Serial.println("temperature alarm");
}

void loop()
{
int temperature = temp.getTemp();
delay(2000); 
if (temperature > MIN_TIME && temperature < MAX_TIME)
{
noTone(SIREN);
}
else
{
tone (SIREN,440,1000);
Serial.println("danger! temperature outside expected");
Serial.print("temperature must be between ");
Serial.print(MIN_TIME);
Serial.print(" and ");
Serial.println(MAX_TIME);
}
Serial.print("temperature: ");
Serial.print(temperature);
Serial.println(" *C\n");
}