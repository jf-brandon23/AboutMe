#DO NO USE CTRL+C TO CLOSE OR ELSE IT WILL BRAKE(WORLD)
from PassClasses import PassClasses #classes
import os #used to check if some files are empty to fix crashing error
from cryptography.fernet import Fernet      #This is the motor of the encryption stuff.
#key = Fernet.generate_key() #used to gen the key
ui3 = "yes"
openfile="passwords.txt"
listy=[]
listy2=[]
specialCharacters="!@#$%^&*()"
checklist=[False,False,False,False,False ]
user=""
trys=0
passcheck1=PassClasses()
cat=""
catagories=["internet", "email", "bills", "school", "general"]
goodpass=False
onemoretime="y"
stat=""

#with open('filekey.key', 'wb') as filekey: #used to gen the key
 #   filekey.write(key)
   
with open('filekey.key', 'rb') as filekey: #gets the key that is used to encriped or deriped
    key = filekey.read()

fernet = Fernet(key) #Sets fernet to the key




name=f"passwords.txt"
#passcheck1.ecrypt(name,fernet) #used if pass folder brakes 
listy=passcheck1.makelist(stat,listy,openfile)





ui = input(f"Would you like to\nLogin(1)\nor\nCreate(2)\naccount?\n ")    #Might debate changing login,create to numbers so people do not type in Login with capital L.
if ui =="1":#this allows the user to login.
    while trys<=3:#Trys gives the user a limited amount of tries. 
        #print(listy)           This was commented out, it was used for testing purposes.
        if trys == 3:
            print("-You are out of tries. ")
            name=f"passwords.txt"
            passcheck1.ecrypt(name,fernet)
            break
        #elif trys == 4:
            #print("-Goodbye")
        else:
            name=f"passwords.txt"
            passcheck1.dcrypt(name,fernet)  
            listy=[]
            listy=passcheck1.makelist(stat,listy,openfile)
            #print(listy)           This was commented out, it was used for testing purposes. 
            trys+=1
            ui=input("Please input a Username- ")
            fname=ui
            ui2=input("Input a Password or did you (forget) your Password? ")#Note to self shorten?
            lname=ui2
            if ui2 == "forget":#If the user forgets his password. Then they can try to reset the password. Username with first name and last name are needed. 
                ui=input("What was your Username? ")
                ui3=input("What is your First name? ")
                ui4=input("What is your Last name? ")
                for c in range(len(listy)):
                    if ui in listy[c][2] and ui3 in listy[c][0] and ui4 in listy[c][1]:
                        ui=input("What would you like your new password to be? ")
                        ui2 =input("Input a strong password or (gen)erate a password. ")# This allows user to either create a custom(unsafe probably) password decide to create a (safe) generate password.
                        if ui2 == "gen":
                            ui2=passcheck1.passgen(ui2)#This runs the ui through a generator.
                            listy[c][3]=ui2
                            print("-Password updated")
                        else:
                            goodpass=passcheck1.passcheck(ui,ui2,checklist)
                            if goodpass==True:
                                listy[c][3]=ui2

            for c in range(len(listy)):
                    if ui in listy[c][2] and ui2 in listy[c][3]:
                        while user != "quit":
                            user=input("Would you like to-\nNew Account?(1)\nView Accounts?(2)\n(quit)\n ") #Category, user first tries to view category, if there doesn't appear any program will ask if user wants to create a category.
                            if user =="1":#This lets the user create a new account for a password. 
                                onemoretime="y"
                                while onemoretime != "n":
                                    cat=""
                                    while cat not in catagories:
                                        cat=input("What catergory do you want to access? \ninternet\nemail\nbills\nschool\ngeneral\n") #This gives the user a selection of very very original catergories.                           
                                    name=f"{fname}{lname}{cat}.txt"
                                    if os.path.exists(f"{fname}{lname}{cat}.txt"):
                                        passcheck1.dcrypt(name,fernet) 
                                    with open(f"{fname}{lname}{cat}.txt","a") as filetowrite:
                                        account=input("Type in account name\n")
                                        account2=input("Type in a username\n")
                                        account3=input("Type in a password \n")
                                        account=(f"{account} {account2} {account3}\n")
                                        filetowrite.write(account)#tell user to input name s
                                    onemoretime="n"#input("Would you like to create another account? (y,n)?\n")
                                    name=f"{fname}{lname}{cat}.txt"
                                    passcheck1.ecrypt(name,fernet) 
                            elif user =="2":#if the user types in that, it will then allow the user to view accounts. 
                                cat=""
                                while cat not in catagories:
                                    cat=input("What catergory do you want to access? \ninternet\nemail\nbills\nschool\ngeneral\n")  #cat stands for catagory. 
                                if os.path.exists(f"{fname}{lname}{cat}.txt"):
                                    name=f"{fname}{lname}{cat}.txt"
                                    passcheck1.dcrypt(name,fernet)
                                    with open(f"{fname}{lname}{cat}.txt","r") as filetowrite:
                                        files=filetowrite.readlines()
                                        for row in files:
                                            rowsplitter2=row.rstrip()
                                            print(rowsplitter2)
                                        onemoretime="n"#input("Would you like to view another account? (y,n)\n")#allows the user to see another account.    
                                        name=f"{fname}{lname}{cat}.txt"
                                        passcheck1.ecrypt(name,fernet)
                                else:
                                    print("Make a file first")   
                        else:
                            print("goodbye")
                            name=f"passwords.txt"
                            passcheck1.ecrypt(name,fernet) 
                            
                    else:
                        trys+=1

                            #this does stuff /\ good stuff. also if you read this I have severe cookie addiction.
elif ui == "2":#Creates new account according to what the user wants. 
    name="passwords.txt"#name of the text file.
    passcheck1.dcrypt(name,fernet) 
    first =input("What is your First Name? ")#Note:We do not sell personal information to any companies.                                    fine print: we do. 
    last =input("What is your Last Name? ")
    ui =input("Input a Username. ")
    ui =(f"{first} {last} {ui}")#This takes the previous inputs. 
    ui2 =input("Input a strong password or (gen) a password. ")# This allows user to either create a custom(unsafe probably) password decide to create a (safe) generate password.
    if ui2 == "gen":
        while ui3 == "yes":
            ui2=passcheck1.passgen(ui2)#This goes to classes and runs the generate function.
            ui3=input("Generate a new one? (yes,no)\n")#This goes through a while loop repeating the generate a new password function. As long as the user inputs yes it will continuing repeating until the user is satisfied. 
        if ui3=="no":
            with open("passwords.txt","a") as filetowrite:#opens a text file and inputs the password along with the first and last name of the person.
                filetowrite.write(f"{ui} {ui2}\n")
                print("-Your Account has been created. Log back in")#Forces the user to log back in
                name="passwords.txt"
                passcheck1.ecrypt(name,fernet)#This then encryptys the password along with all the information.
    else:
        goodpass=passcheck1.passcheck(ui,ui2,checklist)    #This runs the user generated password is completely unsafe cause if would probably 123456, through a checklist telling them that it is unsafe to use forcing them to change it to one much safer. 
        if goodpass== True:
            with open("passwords.txt","a") as filetowrite:
                filetowrite.write(f"{ui} {ui2}\n")#Once the password is checked if it is unsafe then it passes through with the information being recorded in the text.file. 
                print("-Your Account has been created. ")
                name="passwords.txt"
                passcheck1.ecrypt(name,fernet)
