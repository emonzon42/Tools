"""
Luhns Algorithm

I made this because I saw a youtube video on the algorithm once and wanted to practice python a bit
"""

CARD = 0000000000000000 #CARDNUMBERHERE

def luhns(cardnum):
    total = 0 # total of all products added together
    digits = [int(x) for x in str(cardnum)] #breaks card number down to list of digits
    weights = [2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1]
    
    i = 0
    while i < len(digits):
        product = digits[i]*weights[i] #each digit is multiplied by weight

        if (product >= 10): # if product is in double digits, add the numbers together (21 would be 2 + 1 so 3)

            temp = [int(x) for x in str(product)] #breaks product into list
            total += (temp[0] + temp[1])
        else:
            total += product
        i+=1

    if (total % 10 == 0): #if the total ends in 0 then it is a valid card number
        return True
    else:
        return False
        

if luhns(CARD):
    print("Valid card")
else:
    print("Not valid")

