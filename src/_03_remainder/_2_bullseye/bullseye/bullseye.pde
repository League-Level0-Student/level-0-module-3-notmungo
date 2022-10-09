
void setup() {
 
  // set the size of your sketch
  size(500,300);
}

void draw() {

  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  int s = 120;
  
  for(int i = 1 ; i <= 20;i++){
  if (i % 2 ==0) {
  
      fill(#FF0000);
  }
     else {
       fill(#0000FF) ;
     }


  
  
  
  ellipse(240,120,s,s);
  s = s - 5 ;
  }
  
  //Use an if statement and remainder to alternate the color of your rings
   
      
    }
