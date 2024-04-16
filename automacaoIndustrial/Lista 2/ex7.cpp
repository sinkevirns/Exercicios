#define potPin 0 
#define ledPin 9 

int valPot = 0; 

void setup() 
{
pinMode(ledPin,OUTPUT); 
}

void loop() 
{
valPot = analogRead(potPin); 
valPot = map(valPot,0,1023,0,255); 
analogWrite(ledPin,valPot ); 
}