int led = 9; 
int glow = 0; 
int fade = 5; 

void setup() 
{
pinMode(led, OUTPUT);
}

void loop() 
{
analogWrite(led, glow);
glow = glow + fade;
if (glow == 0 || glow == 255) {
fade = -fade ;
}
delay(30);
}