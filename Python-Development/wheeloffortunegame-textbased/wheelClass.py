import random
class Wheel:
    global wheelList
    wheelList = [[1000, 1000, 1000, 800, 800, 800,"Lose a turn", 500, 500, 500, 650, 650, 650, 500, 500, 500, 900, 900, 900, "bankrupt", "bankrupt", "bankrupt", 
        5000, 5000, 5000, 500, 500, 500, 900, 900, 900,"Lose a turn", 700, 700, 700, 600, 600, 600, 800, 800, 800, 500, 500, 500, 700, 700, 700, 500, 500, 500, 600, 
        600, 600, 550, 550, 550, 500, 500, 500,"Lose a turn", 900, 900, 900, "bankrupt", 1000000, "bankrupt", 650, 650, 650, 900, 900, 900, 700, 700, 700],
                 [1000, 1000, 1000, 800, 800, 800,"Lose a turn", 500, 500, 500, 650, 650, 650, 500, 500, 500, 900, 900, 900, "bankrupt", "bankrupt", "bankrupt", 
        5000, 5000, 5000, 500, 500, 500, 900, 900, 900,"Lose a turn", 700, 700, 700, 600, 600, 600, 800, 800, 800, 500, 500, 500, 700, 700, 700, 500, 500, 500, 600, 
        600, 600, 550, 550, 550, 500, 500, 500,"Lose a turn", 900, 900, 900, "bankrupt", "Car", "bankrupt", 650, 650, 650, 900, 900, 900, 700, 700, 700], [1000, 1000, 1000, 800, 800, 800,"Lose a turn", 500, 500, 500, 650, 650, 650, 500, 500, 500, 900, 900, 900, "bankrupt", "bankrupt", "bankrupt", 
        5000, 5000, 5000, 500, 500, 500, 900, 900, 900,"Lose a turn", 700, 700, 700, 600, 600, 600, 800, 800, 800, 500, 500, 500, 700, 700, 700, 500, 500, 500, 600, 
        600, 600, 550, 550, 550, 500, 500, 500,"Lose a turn", 900, 900, 900, "bankrupt", "Cruise to Hawaii", "bankrupt", 650, 650, 650, 900, 900, 900, 700, 700, 700],[1000, 1000, 1000, 800, 800, 800,"Lose a turn", 500, 500, 500, 650, 650, 650, 500, 500, 500, 900, 900, 900, "bankrupt", "bankrupt", "bankrupt", 
        5000, 5000, 5000, 500, 500, 500, 900, 900, 900,"Lose a turn", 700, 700, 700, 600, 600, 600, 800, 800, 800, 500, 500, 500, 700, 700, 700, 500, 500, 500, 600, 
        600, 600, 550, 550, 550, 500, 500, 500,"Lose a turn", 900, 900, 900, "bankrupt", "Lego Star Wars", "bankrupt", 650, 650, 650, 900, 900, 900, 700, 700, 700]] #Choices for the wheel
    
    
    @staticmethod
    def spin(round):
        return random.choice(wheelList[round])