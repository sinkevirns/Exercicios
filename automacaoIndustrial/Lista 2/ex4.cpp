#define BUTTON 2

void setup()
{
 pinMode(BUTTON, INPUT); 
 Serial.begin(9600); 
}
void loop()
{
 if(digitalRead(BUTTON)) 
 {
 Serial.println("button unpressed\n"); 
 }
 else 
 {
 Serial.println("button pressed\n"); 
 }
 delay(250); 
}