import turtle as t
import time
from classes import pieces



wn= t.Screen()
title=t.Turtle()
fontSetup=("Courier",30,'italic')
BTNfontSetup=("Courier",20,'italic')
BTNfontSetupsmall=("Courier",13,'italic')
BTNfontSetupbig=("times new roman",13,'bold')

def mainmenu():
    global startBTN,creditsBTN
    #Create a main menu
        #Set the turtle towards the top.
    title.hideturtle()
    title.penup()
    title.speed(0)
    title.goto(0,200)
        #Create a title screen.
    title.write("Checkers",align="center",font=fontSetup) #The "fontSetup" is just a variable that is assigned to font settings

        #Create a play button
    startBTN=t.Turtle("square")
    startBTN.speed(0)
    startBTN.color("#ffbefb")
    startBTN.shapesize(3,5)
    startBTN.penup()
    startBTN.goto(0,30)

    #Allows area to be clicked
    #startBTN.onclick(getPosition)
            #Create new turtle for the worwds on button.
    start=t.Turtle()
    start.penup()
    start.hideturtle()
    start.goto(0,60)
    start.write("Start",align="center",font=BTNfontSetup)

        #Create a credits button 
    creditsBTN=t.Turtle("square")
    creditsBTN.speed(0)
    creditsBTN.color("#ffbefb")
    creditsBTN.shapesize(3,6)
    creditsBTN.penup()
    creditsBTN.goto(0,-70)

            #Create new turtle for the words on button.
    credit=t.Turtle()
    credit.penup()
    credit.hideturtle()
    credit.goto(0,-40)
    credit.write("Credits",align="center",font=BTNfontSetup)

          #Create a directions button 
    direcBTN=t.Turtle("square")
    direcBTN.speed(0)
    direcBTN.color("#ffbefb")
    direcBTN.shapesize(3,6)
    direcBTN.penup()
    direcBTN.goto(0,-170)

          #Create new turtle for the words on button.
    direct=t.Turtle()
    direct.penup()
    direct.hideturtle()
    direct.goto(0,-140)
    direct.write("Directions",align="center",font=BTNfontSetup)
  
    erase=t.Turtle("square")
    erase.speed(0)
    erase.color("white")
    erase.hideturtle()
    erase.penup()

    #Now must get the coordinates of the onclick. Testing purposes.
    startBTN.onclick(getPositionstart)
    creditsBTN.onclick(getPositioncredit)
    

def quit():     #Credit:https://stackoverflow.com/questions/58774416/how-to-bind-enter-key-to-a-function-using-turtle
    t.bye()

def credits():
    wn.clear()
    
    intro=t.Turtle()
    intro.hideturtle()
    intro.penup()
    intro.goto(-200,100+20)
    #https://en.wikipedia.org/wiki/Trademark_symbol
    intro.write("""Introducing the"""
                ,align="center",font=BTNfontSetup
                )
    intro.goto(-200,80+20)
    #https://en.wikipedia.org/wiki/Trademark_symbol
    intro.write(""" Creators of Award Winning Checkers™"""
                ,align="center",font=BTNfontSetupsmall
                )

    #First set of Credits    
    name1=t.Turtle()
    name1.penup()
    name1.hideturtle()
    
    time.sleep(1)
    name1.goto(-200,50)
    name1.write("Starring",align="center",font=BTNfontSetup)
    name1.goto(-200,20)
    time.sleep(1)
    name1.write("Sydni",align="center",font=BTNfontSetup)
    
    time.sleep(1)
    intro.goto(-200,0-10)
    intro.write("And",font=BTNfontSetupsmall)
        
    #Second set of credits
    name2=t.Turtle()
    name2.penup()
    name2.hideturtle()
    #name2.goto(-200,-30-20)
    #name2.write("Starring",align="center",font=BTNfontSetup)
    name2.goto(-200,-50) #-60-20
    time.sleep(1)
    name2.write("Brandon",align="center",font=BTNfontSetup)
    
    others=t.Turtle()
    others.hideturtle()
    others.penup()
    others.goto(-200,-200)
    time.sleep(1)
    others.write("and some others",align="center",font=BTNfontSetup)
    others.goto(-200,-230)
    time.sleep(1)
    others.write("StackOverflow",align="center",font=BTNfontSetupsmall)
    others.goto(-200,-250)
    time.sleep(1)
    others.write("Geeksforgeek",align="center",font=BTNfontSetupsmall)
    others.goto(-200,-270)
    time.sleep(1)
    others.write("Bander",align="center",font=BTNfontSetupsmall)
    others.goto(-200,-290)
    time.sleep(1)
    others.write("And most Importantly",align="center",font=BTNfontSetupsmall)
    others.goto(0,-290)
    time.sleep(2)
    others.write("Coffee",align="center",font=BTNfontSetupbig)
    
def directions():
    wn.clear()
    
    intro=t.Turtle()
    intro.hideturtle()
    intro.penup()
    intro.goto(-200,100+20)
    #https://en.wikipedia.org/wiki/Trademark_symbol
    intro.write("""Directions"""
                ,align="center",font=BTNfontSetup
                )
    intro.goto(-200,80+20)
    #https://en.wikipedia.org/wiki/Trademark_symbol
    intro.write(""" 
                Click screen then click piece
                to move piece to desired location."""
                ,align="center",font=BTNfontSetupsmall
                )

    

wn.onkey(quit,"q")

#Check if cursor clicked on button. If the cursor is within range. 
checkerBoardCoordinates=[]
def printboard():   #Prints the board
    board = t.Turtle()
    board.shape("square")
    board.penup()
    #board.goto(-100,100)
    board.turtlesize(3,3,3)
    
    c=0
    y=200   #120
    while (y>-250): #-250
        x=-260  #-120
        y-=60   #20
        c+=1
        while(x<200):
            x+=60   #21
            c+=1
            board.penup()
            board.goto(x,y)
            board.pendown()
            if (c%2==1):
                board.color("red")
                checkerBoardCoordinates.append((x,y,"red"))
            else:
                board.color("black")
                checkerBoardCoordinates.append((x,y,"black"))
            board.stamp()
    print(checkerBoardCoordinates)

def getPositionstart(x,y):
    global printboard,checkerBoardCoordinates
    print("(", x, "," ,y,")")
    if x >= -40 or x <=40 and y >= -40 or y <=40:
        wn.clear()
        printboard()
        even=0
        for i in range(0,8):
            if i%2==0:
                red=t.Turtle('circle')
                red.color('dark red')
                red.shapesize(2,2,2)
                red.penup()
                red.ondrag(None)
                redpieces.append(red)
                red.goto(checkerBoardCoordinates[i][0],checkerBoardCoordinates[i][1])
        for i in range(8,16):
            if i%2==0:
                red=t.Turtle('circle')
                red.color('dark red')
                red.shapesize(2,2,2)
                red.penup()
                red.ondrag(None)
                redpieces.append(red)
                red.goto(checkerBoardCoordinates[i][0],checkerBoardCoordinates[i][1])
                # c=0
                # y=200   #120
                # while (y>-250): #-250
                #     x=-200  #-120
                #     y-=60   #20
                #     c+=1
                #     while(x<200):
                #         x+=60   #21
                #         c+=1
                #         red.penup()
                #         #red.goto(x,y)
                #         if (c%2==1):
                #             print()
                #         else:
                #             red.goto(x,y)
                        
            #print(redpieces)
        
        #for black in range(12):
        #    black=t.Turtle('circle')
        #    black.color('dark grey')
        #    black.shapesize(2,2,2)
        #    black.penup()
        #    black.ondrag(None)
        #    blackpieces.append(black)
        #    c=0
        #    y=-40   #120
        #    while (y>-250): #-250
        #        x=-200  #-120
        #        y-=60   #20
        #        c+=1
        #        while(x<200):
        #            x+=60   #21
        #            c+=1
        #            black.penup()
        #            #black.goto(x,y)
        #            if (c%2==1):
        #                black.goto(x,y)
        #            else:
        #                print()
        for i in range(0,8):
            if i%2==0:
                black=t.Turtle('circle')
                black.color('dark red')
                black.shapesize(2,2,2)
                black.penup()
                black.ondrag(None)
                blackpieces.append(red)
                black.goto(checkerBoardCoordinates[i][0],checkerBoardCoordinates[i][1])
        for i in range(8,16):
            if i%2==0:
                black=t.Turtle('circle')
                black.color('dark grey')
                black.shapesize(2,2,2)
                black.penup()
                black.ondrag(None)
                blackpieces.append(black)
                black.goto(checkerBoardCoordinates[i][0],checkerBoardCoordinates[i][1])
            #print(blackpieces)
    return

def getPositioncredit(x,y):
    global printboard
    print("(", x, "," ,y,")")
    if x >= -40 or x <=40 and y >= -40 or y <=40:
        credits()
    return

def getPositiondirec(x,y):
    global printboard
    print("(", x, "," ,y,")")
    if x >= -80 or x <=80 and y >= -80 or y <=80:
        directions()
    return
  
def start():
    mainmenu()


start()

#positon=[-200 140,-140 140,-80 140,-20 140,40 140,100 140,160 140,220 140,-200 80,-140 80,-80 80,-20 80,40 80,100 80,160 80,220 80,-200 20,-140 20,-80 20,-20 20,40 20,100 20,160 20,220 20,-200 -40,-140 -40,-80 -40,-20 -40,40 -40,100 -40,160 -40,220 -40,-200 -100,-140 -100,-80 -100,-20 -100,40 -100,100 -100,160 -100,220 -100,-200 -160,-140 -160,-80 -160,-20 -160,40 -160,100 -160,160 -160,220 -160,-200 -220,-140 -220,-80 -220,-20 -220,40 -220,100 -220,160 -220,220 -220,-200 -280,-140 -280,-80 -280,-20 -280,40 -280,100 -280,160 -280,220 -280]

redpieces=[]

blackpieces=[]




#t.onscreenclick(selectPiece(x,y))

t.listen()
#This looks the window making it so it doesn't auto quit. 
wn.mainloop()

#WISH List: Possibility to add a variable to allow the change of colors for a "dark mode" no eye burning white. WHite isn't a bad color, just hurts when staring at 12.00 midnight.
