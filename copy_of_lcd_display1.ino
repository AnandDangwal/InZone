#include<LiquidCrystal.h>

int gasInput = A1;
int led = 13; 
int wheel = 6;
int buzzer = 9;

LiquidCrystal lcd(12,11, 5, 4, 3, 2);


void setup()
{
  lcd.begin(16,2);
  Serial.begin(9600);
  lcd.print("Starting");
  pinMode(gasInput, INPUT);
  pinMode(wheel, OUTPUT);
  noTone(buzzer);
}

void loop(){
  lcd.setCursor(0,1);
  int value = analogRead(gasInput);
  value = map(value, 0, 100 , -40 ,10);
  Serial.println(value);
  delay(250);
  lcd.clear();
  lcd.print(value);
  
  if(value>3){
    delay(1000);
    lcd.clear();
    lcd.print(" DANGER");
    digitalWrite(led, HIGH);
    digitalWrite(wheel, LOW);
    tone(buzzer, 1000 ,500);
  
  }
  
  else{
    lcd.print(" SAFE");
    digitalWrite(led,LOW);
    digitalWrite(wheel, HIGH);
    noTone(buzzer);
  }  
}
 