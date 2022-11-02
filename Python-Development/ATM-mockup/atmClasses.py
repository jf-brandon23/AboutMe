class screen:
    cardScreen=("""Please enter your Card Number.
\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n
Accept                                                                                  Erase
        """)
    pinScreen=("""Please enter your Card Pin.
\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n
Accept                                                                                  Erase
            """)
                                                                                            #.Point of end screen GUI 
    mainmenu=("""Please Choose an option
\n\n\n\n\n\n\n\n\n\n\n\n
Deposit                                                                            WithDrawal

Balance Inquiry                                                              Transfer Balance

Change Pin                                                                            Log Out
        """)

    def __str__(self):
        return ("f{self.cardScreen}"),(f"{self.pinScreen}")

#Each transaction cannot exceed 500

class customer:
    
    def __init__(self):
        self.card=0
        self.pin=0
        self.bank=0
        
    def __str__(self):
        return f"{self.bank}"
        