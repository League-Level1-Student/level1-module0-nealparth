import ddf.minim.*;  
Minim minim;
AudioSample sound;
int x=250;
boolean foreward= true ;
void setup(){
 
  size(600,600);
  minim = new Minim (this);
sound = minim.loadSample("pong.wav", 128);
  
  
}




void draw(){
  background(27,47,209);
  
  fill(66,234,163);
  stroke(66,219,234);
  
  
ellipse(x,250,25,25);

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

}