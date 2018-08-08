ones = ["", "one ","two ","three ","four ", "five ", "six ","seven ","eight ","nine ","ten ","eleven ","twelve ", "thirteen ", "fourteen ", "fifteen ","sixteen ","seventeen ", "eighteen ","nineteen "]
 
twenties = ["","","twenty ","thirty ","forty ", "fifty ","sixty ","seventy ","eighty ","ninety "]
 
thousands = ["","thousand ","million "]
# "billion ", "trillion ", "quadrillion ", "quintillion ", "sextillion ", "septillion ","octillion ", "nonillion ", "decillion ", "undecillion ", "duodecillion ", "tredecillion ", "quattuordecillion ", "quindecillion", "sexdecillion ", "septendecillion ", "octodecillion ", "novemdecillion ", "vigintillion "]

def num_three_digit(n):
    c = n % 10 # singles digit
    b = ((n % 100) - c) / 10 # tens digit
    a = ((n % 1000) - (b * 10) - c) / 100 # hundreds digit
    t = ""
    h = ""
    if a != 0 and b == 0 and c == 0:
        t = ones[a] + "hundred "
    elif a != 0:
        t = ones[a] + "hundred and "
    if b <= 1:
        h = ones[n%100]
    elif b > 1:
        h = twenties[b] + ones[c]
    st = t + h
    return st
 
def num2word(num):
    if num == 0: 
        return 'zero'
    i = 3
    word = ""
    k = 0
    while(i == 3):
        nw = num[-i:]
        num = num[:-i]
        if int(nw) == 0:
            word = num_three_digit(int(nw)) + thousands[int(nw)] + word
        else:
            word = num_three_digit(int(nw)) + thousands[k] + word
        if num == '':
            i = i+1
        k += 1
    return word[:-1]

def main():
    num = (raw_input("Please enter a number(maximum upto 999999999): "))
    print num2word(num)
main()

 

