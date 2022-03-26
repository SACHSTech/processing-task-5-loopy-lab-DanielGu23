import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
   /**
  * A program Sketch.java that draws specific patterns in 8 different quadrants.
  * @author: D. Gu
  */
  
  public void settings() {
	  
    // Size of the call
    size(600, 300);
  }

  public void setup() {
    background(45, 150, 207);
  }

  public void draw() {

    // Draw functions
    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
	  
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();
  }

  
  public void draw_section_outlines(){
    stroke(0);
    noFill();

    // Draw bottom row boxes
    rect(0, 150, 150, 150);
    rect(150, 150, 150, 150);
    rect(300, 150, 150, 150);
    rect(450, 150, 150, 150);

    // Draw top row boxes
    rect(0, 0, 150, 150);
    rect(150, 0, 150, 150);
    rect(300, 0, 150, 150);
    rect(450, 0, 150, 150);
  }
  

  // Draws the 1st section 
  public void draw_section1(){
    float fltX = 0;
    float fltY = 0;
    
    // Nested loop for 30 rows and 30 columns
    for (int intColumn = 0; intColumn < 30; intColumn++){
      for (int intRow = 0; intRow < 30; intRow++){

        // Add distance that boxes must move
        fltX = 5 / 2 + (5 * intColumn);  
        fltY = 305 / 2 + (5 * intRow); 

        // Fill boxes with white
        fill(255);
        noStroke();
        rect(fltX, fltY, (float)(5 / 2), (float)(5 / 2));
      }
    }
  }

  // Draws the 2nd section
  public void draw_section2(){
    float fltX = 0;
    float fltY = 0;

    // Nested loop
    for (int intColumn = 0; intColumn < 30; intColumn++){
      for (int intRow = 0; intRow < 30; intRow++){
        fltX = 305 / 2 + (5 * intColumn);  
        fltY = 305 / 2 + (5 * intRow); 
        
        // Fill with white if column number is odd (starts at 0)
        if (intColumn % 2 == 0){
          fill(255);
          noStroke();
          rect(fltX, fltY, (float)(5/2), (float)(5/2));
        }
          
        // Fill with black if column number is even
        else{
          fill(0);
          noStroke();
          rect(fltX, fltY, (float)(5/2), (float)(5/2));
        }
      }
    }
  }

  // Draws the 3rd section
  public void draw_section3(){
    float fltX = 0;
    float fltY = 0;

    for (int intColumn = 0; intColumn < 30; intColumn++){
      for (int intRow = 0; intRow < 30; intRow++){
        fltX = 605 / 2 + (5 * intColumn);  
        fltY = 305 / 2 + (5 * intRow); 
        
        // Fill with black if row number is odd
        if (intRow % 2 == 0){
          fill(0);
          noStroke();
          rect(fltX, fltY, (float)(5/2), (float)(5/2));
        }
        
        // Fill with white if row number is even
        else{
          fill(255);
          noStroke();
          rect(fltX, fltY, (float)(5/2), (float)(5/2));
        }
      }
    }
  }

  // Draws the 4th section
  public void draw_section4(){
    float fltX = 0;
    float fltY = 0;

    for (int intColumn = 0; intColumn < 30; intColumn++){
      for (int intRow = 0; intRow < 30; intRow++){
        fltX = 905 / 2 + (5 * intColumn);  
        fltY = 305 / 2 + (5 * intRow); 

        // Fill with black if row number is odd
        if (intRow % 2 == 0){
          fill(0);
          noStroke();
          rect(fltX, fltY, (float)(5/2), (float)(5/2));
        }

        // Fill with black if row number and column number are even
        else if((intRow % 2 != 0) && (intColumn % 2 != 0)){
          fill(0);
          noStroke();
          rect(fltX, fltY, (float)(5/2), (float)(5/2));
        }

        // Fill all other rectangles with white
        else{
          fill(255);
          noStroke();
          rect(fltX, fltY, (float)(5/2), (float)(5/2));
        }
      }
    }
  }

  // Draws the 5th section
  public void draw_section5(){
    float fltX = 0;
    float fltY = 0;

    // Draws triangle by manipulating inner loop's initial value
    for (int intColumn = 29; intColumn >= 0; intColumn--){
      for (int intRow = 30 - intColumn; intRow <= 30; intRow++){
        fltX = 5 / 2 + (5 * intColumn);  
        fltY = 5 / 2 + (5 * intRow); 
        fill(255);
        noStroke();
        rect(fltX, fltY, (float)(5/2), (float)(5/2));
      }
    }
  }

  // Draws the 6th section
  public void draw_section6(){
    float fltX = 0;
    float fltY = 0;

    // Draws triangle by manipulating inner loop's lower limit
    for (int intColumn = 29; intColumn >= 0; intColumn--){
      for (int intRow = 29; intRow >= intColumn; intRow--){
        fltX = 305 / 2 + (5 * intColumn);  
        fltY = 5 / 2 + (5 * intRow); 
        fill(255);
        noStroke();
        rect(fltX, fltY, (float)(5/2), (float)(5/2));
      }
    }
  }

  // Draws the 7th section
  public void draw_section7(){
    float fltX = 0;
    float fltY = 0;

    // Draws triangle by manipulating inner loop's initial value
    for (int intColumn = 0; intColumn < 30; intColumn++){
      for (int intRow = 29 - intColumn; intRow >= 0; intRow--){
        fltX = 605 / 2 + (5 * intColumn);  
        fltY = 5 / 2 + (5 * intRow); 
        fill(255);
        noStroke();
        rect(fltX, fltY, (float)(5/2), (float)(5/2));
      }
    }
  }

  // Draws the 8th section
  public void draw_section8(){
    float fltX = 0;
    float fltY = 0;

    // Draws triangle by manipulating inner loop's lower limit
    for (int intRow = 0; intRow < 30; intRow++){
      for (int intColumn = 29; intColumn >= intRow; intColumn--){
        fltX = 905/2 + (5 * intColumn);  
        fltY = 5/2 + (5 * intRow); 
        fill(255);
        noStroke();
        rect(fltX, fltY, (float)(5/2), (float)(5/2));
      }
    }
  }






}
