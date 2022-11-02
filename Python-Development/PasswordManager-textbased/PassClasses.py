from cryptography.fernet import Fernet
import random


class PassClasses: 


    spechr=[33,64,35,36,37,94,38,42,40,41]
    endpassword="1"
    checklist=[False,False,False,False,False ]
    capletters=0
    lowerletters=0
    numbers=0
    speletters=0

    def passgen(self,ui2):

        capletters=3#int(input("how many cap letters"))
        lowerletters=5#nt(input("how many lower case letters"))
        numbers=2#int(input("how many numbers"))
        speletters=2#int(input("how many special letters"))
        password=[]
        passchecker=[capletters,lowerletters,numbers,speletters]
        spechr=[33,64,35,36,37,94,38,42,40,41]
        ui2=""
        for i in range(passchecker[0]):
            password.append(chr(random.randint(65,90)))
        for i in range(passchecker[1]):
            password.append(chr(random.randint(97,122)))
        for i in range(passchecker[2]):
            password.append(chr(random.randint(48,59)))
        for i in range(passchecker[3]):
            password.append(chr(random.choice(spechr)))
            random.shuffle(password)

        for i in password:
            ui2+=i
        print(ui2)
        return ui2

    def passcheck(self,ui,ui2,checklist):
        spechr=[33,64,35,36,37,94,38,42,40,41]
        if len(ui2)>=8:
            checklist[4]=True
        for i in ui2:
            if ord(i) in range(48,58):
                checklist[0]=True
            elif ord(i) in range(65,91):
                checklist[1]=True
            elif ord(i) in range(97,123):
                checklist[2]=True
            elif ord(i) in spechr:
                checklist[3]=True
            else:
                break
        if False in checklist:
            print("Password is weak try again.")
            print(checklist)
        else:
            print("Good password, now relog.")
            ui+=(f" {ui2}")
            return True



    def ecrypt(self,filename,fernet):
        
        with open(filename,"rb") as file:
            original=file.read()
        encrypted_data = fernet.encrypt(original)         
        with open(filename, 'wb') as encrypted_file:
            encrypted_file.write(encrypted_data)    
    
    def dcrypt(self,filename,fernet):
        with open(filename, "rb") as file:
            encrypted_data = file.read()
        decrypted_data = fernet.decrypt(encrypted_data)
        with open(filename, "wb") as file:
            file.write(decrypted_data)
    
    def makelist(self,stat,listy,openfile):
        with open(openfile,"r")as file:
            stat=file.readlines()
    
        for row in stat:
            #print(row.rstrip("\n")) This was used for Testing purposes.
            rowsplitter=row.rstrip("\n")
            rowsplitter = row.split(" ")
            listy.append(rowsplitter)
        return listy
