int y= 20;
 int x = (int) random(width);
int score=  0;



void setup(){
  size(600, 600);
 

}


void draw(){

 background(183,118,216); 
 
  fill(118,132,216);
  stroke(19,214,21);
  y+=5;
  ellipse(x,y,25,25);
  rect(mouseX, 500, 100, 100);
  fill(0, 0, 0);
textSize(16);
text("Score: " + score, 20, 20);

  if(y>600){
     x = (int) random(width);
y=20;  
  
 
}
checkCatch(x);
}
void checkCatch(int x){
     if (x > mouseX && x < mouseX+100&& y==500){
          score++;
          println(x  + " " + mouseX);
     }
     else if (score < 0) 
          score--;
     println("Your score is now: " + score); }