#define buttonA 6 
#define buttonB 7 
#define ledXOR 8 
#define ledOR 9 
#define ledAND 10 

boolean valA = 0;
boolean valB = 0;

void setup() 
{
pinMode(ledXOR , OUTPUT);
pinMode(ledOR, OUTPUT);
pinMode(ledAND, OUTPUT);
pinMode(buttonA, INPUT);
pinMode(buttonB, INPUT);
}

void loop()
{
valA = digitalRead(buttonA);
valB = digitalRead(buttonB);
digitalWrite(ledXOR, valA ^ valB); 
digitalWrite(ledOR , valA | valB); 
digitalWrite(ledAND , valA & valB); 
}