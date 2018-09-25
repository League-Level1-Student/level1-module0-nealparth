import ddf.minim.*;  
Minim minim;
AudioSample sound;
int x=250;
int y= 250;
boolean foreward= true ;
boolean up= true;
void setup(){

 
  size(600,600);
  minim = new Minim (this);
sound = minim.loadSample("209245__sonsdebarcelona__ping-pong.wav", 128);
  
  
}




void draw(){
  background(27,47,209);
  
  fill(66,234,163);
  stroke(66,219,234);
  
  
ellipse(x,y,25,25);

if(foreward){
  x+=6;
}
 if(!foreward){
  x-=9;
}
 if(x>=width){
   foreward=false;
 }
 if(x<=0){
   foreward=true;
 }
 
sound.trigger();
if(up){
  y+=6;
}
 if(!up){
  y-=6;
}

 if(y<=0){
   up=true;
 }
 
sound.trigger();

rect(mouseX,550,100,500);


if(intersects(x,y,mouseX,550,100)){
  up=!up;
  foreward=!foreward;
}
}
boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
     if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
          return true;
     else 
          return false;
}
