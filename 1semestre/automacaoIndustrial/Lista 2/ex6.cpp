#define pot A0 

int potvalue; 

void setup()
{
Serial.begin(9600); 
}

void loop()
{
potvalue = analogRead(A0); 
Serial.print("Valor do Potenciometro = "); 
Serial.println(potvalue); 
delay(250); 
}