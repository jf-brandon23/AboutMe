#Intro to the game.
print ('''  Welcome to
  Checkers
    ''')
#https://patorjk.com/software/taag/#p=display&f=Graffiti&t=Type%20Something%20

help=input("How to play? (y,n) ")
if help=="y":
  print("Something change later.")
#Step one create board
#This link if important for asscii art. 
#https://theasciicode.com.ar/
#https://www.alt-codes.net/circle-symbols
#board must be 8x8

class Board():
  def __init__(self,board):
    for r in range(9):
          print(board[r][0]+" | "+board[r][1]+" | "+board[r][2]+" | "+board[r][3]+" | "+board[r][4]+" | "+board[r][5]+" | "+board[r][6]+" | "+board[r][7]+" | "+board[r][8]+" | ")
          if r<9:
                print("-"*35)
  pass

board = [[" ", "1", "2", "3", "4", "5", "6", "7","8"],["a", " ", " ", " ", " ", " ", " ", " "," "], ["b", " ", " ", " ", " ", " ", " ", " "," "], ["c", " ", " ", " ", " ", " ", " ", " "," "], ["d", " ", " ", " ", " ", " ", " ", " "," "], ["e", " ", " ", " ", " ", " ", " ", " "," "], ["f", " ", " ", " ", " ", " ", " ", " "," "], ["g", " ", " ", " ", " ", " ", " ", " "," "], ["h", " ", " ", " ", " ", " ", " ", " "," "]]
winner = False
turn = 0

def printBoard(board):
    for r in range(9):
        print(board[r][0]+" | "+board[r][1]+" | "+board[r][2]+" | "+board[r][3]+" | "+board[r][4]+" | "+board[r][5]+" | "+board[r][6]+" | "+board[r][7]+" | "+board[r][8]+" | ")
        if r<9:
              print("-"*35)

#printBoard(board)


#Step two create pieces for the boardgame
white1="●"
white2="●"
white3="●"
white4="●"
white5="●"
white6="●"
white7="●"
white8="●"
white9="●"
white10="●"
white11="●"
white12="●"

black1="○"
black2="○"
black3="○"
black4="○"
black5="○"
black6="○"
black7="○"
black8="○"
black9="○"
black10="○"
black11="○"
black12="○"

#place pieces on board

def startGame():
  
  board[1][1] = white1
  board[1][3] = white2
  board[1][5] = white3
  board[1][7] = white4
  board[2][2] = white5
  board[2][4] = white6
  board[2][6] = white7
  board[2][8] = white8
  board[3][1] = white9
  board[3][3] = white10
  board[3][5] = white11
  board[3][7] = white12
  #Transition of piece color
  board[6][2] = black1
  board[6][4] = black2
  board[6][6] = black3
  board[6][8] = black4
  board[7][1] = black5
  board[7][3] = black6
  board[7][5] = black7
  board[7][7] = black8
  board[8][2] = black9
  board[8][4] = black10
  board[8][6] = black11
  board[8][8] = black12

startGame()
printBoard(board)


#get user input
while not winner:
  #Google - research on how to use a dictionary instead of conditionals
  print(" ●'s Turn")
  r = input("What ROW is the piece you want to move in? ")
  c = int(input("What COLUMN is the piece you want to move in? "))
  move = input("Would you like to go left or right? ")
  if r == "a":
    r = 1
  elif r == "b":
    r = 2
  elif r == "c":
    r = 3
  elif r == "d":
    r = 4
  elif r == "e":
    r = 5
  elif r == "f":
    r = 6
  elif r == "g":
    r = 7
  elif r == "h":
    r = 8
  if board[r][c] == "●":
    if move == "left" and board[r+1][c-1] == " ":
      board[r+1][c-1] = board[r][c]
      board[r][c] = " "
    elif move == "left" and board[r+1][c-1] == "○":
      board[r+2][c-2] = board[r][c]
      board[r+1][c-1] = " "
    
    elif move == "right" and board[r+1][c+1] == " ":
      board[r+1][c+1] = board[r][c]
      board[r][c] = " "
    elif move == "right" and board[r+1][c+1] == "○":
      board[r+2][c+2] = board[r][c]
      board[r+1][c+1] = " "
      board[r][c] = " "
    else:
      print("Can't go here")
    printBoard(board)
  
  print(" ○'s Turn")#The reason for a tab is so the symbol is more easily viewable.
  r = input("What ROW is the piece you want to move in? ")
  c = int(input("What COLUMN is the piece you want to move in? "))
  move = input("Would you like to go left or right? ")
  if r == "a":
    r = 1
  elif r == "b":
    r = 2
  elif r == "c":
    r = 3
  elif r == "d":
    r = 4
  elif r == "e":
    r = 5
  elif r == "f":
    r = 6
  elif r == "g":
    r = 7
  elif r == "h":
    r = 8
  if board[r][c] == "○":
    if move == "left" and board[r-1][c-1] == " ":
      board[r-1][c-1] = board[r][c]
      board[r][c] = " "
    elif move == "left" and board[r-1][c-1] == "●":
      board[r-2][c-2] = board[r][c]
      board[r-1][c-1] = " "
      board[r][c] = " "
    elif move == "right" and board[r-1][c+1] == " ":
      board[r-1][c+1] = board[r][c]
      board[r][c] = " "
    elif move == "right" and board[r-1][c+1] == "●":
      board[r-2][c+2] = board[r][c]
      board[r-1][c+1] = " "
      board[r][c] = " "
    else:
      print("[Can't go here]")
  printBoard(board)
  



#step three create a system to recognize when a piece becomes "king"




#step 4 create a system to recognize when a player is able to win.