#define LDR A0 
#define led 8 

float luminosity; 
float sample; 

void setup()
{
Serial.begin(9600); 
pinMode(led, OUTPUT); 
digitalWrite(led, LOW); 
}

void loop()
{
sample = 0; 
for(int i=0; i < 100 ; i++)
{
luminosity = analogRead(LDR); 
luminosity = (luminosity / 1024) * 100; 
sample = sample + luminosity; 
}
sample = sample/100; 
Serial.print("Luminosidade = "); 
Serial.print(sample, 0); 
Serial.println("%"); 
if(sample < 30) 
{
digitalWrite(led,HIGH);
}
else 
{
digitalWrite(led,LOW); 
}
delay(250); 
}