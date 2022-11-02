#python3 uses tkinter / python2 uses Tkinter
from cgitb import text
from tkinter import *
import pandas as pd
from atmClasses import screen
from atmClasses import customer
import warnings
import numpy as np
import time

#Error with comparison according to source a solution.# https://stackoverflow.com/questions/40659212/futurewarning-elementwise-comparison-failed-returning-scalar-but-in-the-futur
warnings.simplefilter(action='ignore', category=FutureWarning)
print('x' in np.arange(5))   #returns False, without Warning

#in turtle: wn
root = Tk()     #creates your screen
root.title("ATM") #set the window title
root.geometry("500x550")    #Size of the window

background_color="gray"        #Creates color of the background
root.configure(background=background_color) #Changes the color of the inital background color.


atmData= pd.read_csv("db.tsv")
#atmData.to_csv(r"C:\Users\oscul\Documents\GitHub\CSP\Finals2022\ATM\dataatm.csv")

creditcard=atmData['CreditCard'].unique()
#print(creditcard)
creditpin=atmData['Pin'].unique()
#print(creditpin)
cardsavings=atmData['Savings'].unique()
#print(cardsavings)


#This will determine which screen to be set. 0=input card number, 1=input card pin, 2=main menu
screencount=0

tempcardNumber=("")
tempcardPin=("")


#This is for the entry box.
outputMessage=""    #This actually changes the message
outputText= StringVar() #This sends the message to the GUI
#Fonts          #Terminal
title_Font = ("System", 20, "bold")  #"Comic Sans MS"
informationFont = ("System", 13, "bold")
button_Font = ("Terminal", 10, "bold")  #Font for the button

#Various functions for the buttons, and others.

def quitapp():    #will be used for other buttons will not rename
    #YOU SHALL NOT PASS
    root.quit()
    pass

def buttonClick(item):
    global outputMessage
    
    outputMessage += str(item)
    outputText.set(outputMessage)

def clearButton():
    global outputMessage
    
    outputMessage=""
    outputText.set(outputMessage)

#Acceptcard screen
def acceptcard(num):
    global outputMessage,greenacceptButton,tempcardNumber,creditcard,informationText,screencount,clearbutton,title
    incorrect=0
    while incorrect != 3:
        for num in creditcard:
            if num in creditcard:
                print("hi")
                screencount+=1
                if screencount == 1:
                    #informationText = screen.cardPin()
                    #informationTextbox.insert(INSERT,informationText)
                    title.config(bg="#2ff726",text="LOADING...")
                    time.sleep(1)
                    informationTextbox.delete('1.0', END)
                    informationTextbox.insert(INSERT,screen.pinScreen)
                    clearButton()
                    title.config(bg="white",text="ATM :)")
                    greenacceptButton.config(command=lambda:acceptpin(outputMessage))
                    a3Button.config(command=lambda:acceptpin(outputMessage))
                    
                    return

            else:
                if incorrect == 3:
                    quitapp()
    


def acceptpin(pin):
    global outputMessage,tempcardPin,greenacceptButton,informationText
    for pin in creditpin:
        if pin in creditpin:
            screencount+=1
            if screencount == 2:
                informationText = screen.mainmenu()
                informationTextbox.insert(INSERT,informationText)
                greenacceptButton.config(command=lambda:acceptpin(outputMessage))
        else:
            quitapp()

    tempcardPin+=outputMessage
    print(tempcardPin)
    pass

def deposit():
    pass

def withdrawal():
    pass

def balanceinquiry():
    pass

def transferbalance():
    pass

def changepin():
    pass

def logout():
    pass

#object = Constructor(window,options)
title=Label(root,text="ATM :)",font=title_Font,bg="white") #Logo/Name of the ATM.
                                        #In case of missing original size width=437,height=400
atmscreenFrame = Frame(root,bd=0,bg="#72A7C2",highlightbackground="red",width=437,height=400)   #"Screen" of the GUI
atmscreenFrame.grid_propagate(0)    #Used to keep the screen Frame to set size.

numpadFrame= Frame(root,bd=0,bg="#B9B9B9",highlightbackground="red",width=20,height=20) #Numpad a frame for the items below
number1Button = Button(numpadFrame,text="1",font=button_Font,command=lambda:buttonClick(1))   #Names of the button.
number2Button = Button(numpadFrame,text="2",font=button_Font,command=lambda:buttonClick(2))   #Names of the button.
number3Button = Button(numpadFrame,text="3",font=button_Font,command=lambda:buttonClick(3))   #Names of the button.
number4Button = Button(numpadFrame,text="4",font=button_Font,command=lambda:buttonClick(4))   #Names of the button.
number5Button = Button(numpadFrame,text="5",font=button_Font,command=lambda:buttonClick(5))   #Names of the button.
number6Button = Button(numpadFrame,text="6",font=button_Font,command=lambda:buttonClick(6))   #Names of the button.
number7Button = Button(numpadFrame,text="7",font=button_Font,command=lambda:buttonClick(7))   #Names of the button.
number8Button = Button(numpadFrame,text="8",font=button_Font,command=lambda:buttonClick(8))   #Names of the button.
number9Button = Button(numpadFrame,text="9",font=button_Font,command=lambda:buttonClick(9))   #Names of the button.
number0Button = Button(numpadFrame,text="0",font=button_Font,command=lambda:buttonClick(0))   #Names of the button.

yellowcancelButton = Button(numpadFrame,text="C",font=button_Font,background="yellow",command=clearButton)  #Button to cancel actions.
reddenyButton = Button(numpadFrame,text="X",font=button_Font,background="red",command=clearButton)  #This is backspace.
greenacceptButton = Button(numpadFrame,text="O",font=button_Font,background="#7EF05D",command=lambda:acceptcard(outputMessage))  #This is the accept button.

asideFrame = Frame(root,bd=0,bg="gray",highlightbackground="red")   #Frame in charge of the left side of the screen.
bsideFrame = Frame(root,bd=0,bg="gray",highlightbackground="red")   #Frame in charge of the right side of the screen.

#This pushes everthing down similar to a ATM.
spaceALabel = Label(asideFrame,background="gray")
spaceBLabel = Label(bsideFrame,background="gray")

a1Button = Button(asideFrame,text="A1",font=button_Font,command=deposit)
a2Button = Button(asideFrame,text="A2",font=button_Font,command=withdrawal)
a3Button = Button(asideFrame,text="A3",font=button_Font,command=lambda:acceptcard(outputMessage))    #Will be accept button
b1Button = Button(bsideFrame,text="B1",font=button_Font,command=transferbalance)
b2Button = Button(bsideFrame,text="B2",font=button_Font,command=changepin)
b3Button = Button(bsideFrame,text="B3",font=button_Font,command=clearButton)    #Will be the Decline Button
#Decisions Decisions, its is between old style ATM machines or d-pad

#Packing or griding the frames and or parts
title.grid(row=0,column=5) #grid it into the screen, THIS IS REQURIED

atmscreenFrame.grid(row=1,column=5,pady=8)

##inscreenFrame.grid(row=0,column=0)

numpadFrame.grid(row=4,column=5)

number1Button.grid(row=0,column=0,pady=1,padx=1)
number2Button.grid(row=0,column=1,pady=1,padx=1)
number3Button.grid(row=0,column=2,pady=1,padx=1)
number4Button.grid(row=1,column=0,pady=1,padx=1)
number5Button.grid(row=1,column=1,pady=1,padx=1)
number6Button.grid(row=1,column=2,pady=1,padx=1)
number7Button.grid(row=2,column=0,pady=1,padx=1)
number8Button.grid(row=2,column=1,pady=1,padx=1)
number9Button.grid(row=2,column=2,pady=1,padx=1)
number0Button.grid(row=3,column=1,pady=1,padx=1)

number1Button.bind('<Button-1>')    #Binds all the keys to actual keys on keyboard.
number2Button.bind('<Button-2>')
number3Button.bind('<Button-3>')
number4Button.bind('<Button-4>')
number5Button.bind('<Button-5>')
number6Button.bind('<Button-6>')
number7Button.bind('<Button-7>')
number8Button.bind('<Button-8>')
number9Button.bind('<Button-9>')
number0Button.bind('<Button-0>')


greenacceptButton.grid(row=2,column=3,pady=2,padx=2)
reddenyButton.grid(row=1,column=3,pady=2,padx=2)
yellowcancelButton.grid(row=0,column=3,pady=2,padx=2)
#Put this in a separate frames.
a1Button.grid(row=1,column=0,pady=5,padx=0)
a2Button.grid(row=2,column=0,pady=5,padx=0)
a3Button.grid(row=3,column=0,pady=5,padx=0)
b1Button.grid(row=1,column=0,pady=5,padx=0)
b2Button.grid(row=2,column=0,pady=5,padx=0)
b3Button.grid(row=3,column=0,pady=5,padx=0)

spaceALabel.grid(row=0,column=0,pady=110)
spaceBLabel.grid(row=0,column=0,pady=110)

asideFrame.grid(row=1,column=0)
bsideFrame.grid(row=1,column=6)

#Used to display information
informationTextbox = Text(atmscreenFrame,bg="#72A7C2",fg="white",width=54,height=24,font=informationFont)
informationTextbox.grid_propagate(0)
inputBox = Entry(atmscreenFrame,bg="#1f3b49",width=72,fg="white",textvariable=outputText)
inputBox.grid_propagate(0)

informationTextbox.place(x=0,y=0)
inputBox.place(x=0,y=380)

#Step 1 Language screen/for the time being must complete core features.

#Step 2 Card number
# if screencount == 0:
    #informationText= screen.cardScreen

informationTextbox.insert(INSERT,screen.cardScreen)

#greenacceptButton.config(command=lambda:acceptcard(outputMessage))
#informationTextbox.insert(INSERT)


#This is for testing purposes. Quickly quits the window. ping 
def quitTK(q):
    root.quit()
    
root.bind('q',quitTK)

root.mainloop()
#tutorialspoint
#geeksforgeeks