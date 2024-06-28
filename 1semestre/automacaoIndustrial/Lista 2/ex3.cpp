char letter;

#define ledRed 8
#define ledGreen 9
#define ledYellow 10

void setup() 
{
Serial.begin(9600);
pinMode(ledRed, OUTPUT);
pinMode(ledGreen, OUTPUT);
pinMode(ledYellow,OUTPUT);
digitalWrite (ledRed, LOW);
digitalWrite (ledGreen, LOW);
digitalWrite (ledYellow, LOW);
}

void loop() 
{
while (Serial.available() > 0) 
{
letter = Serial.read();
if (letter == 'r' || letter =='R')
{
digitalWrite(ledRed,!digitalRead(ledRed));
}
else if (letter == 'g' || letter =='G')
{ 
digitalWrite(ledGreen,!digitalRead(ledGreen));
}
else if (letter == 'y' || letter =='Y')
{
digitalWrite(ledYellow,!digitalRead(ledYellow));
}
Serial.println(letter);
}
}