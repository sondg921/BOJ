S = input()
al_list = ["a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"]
list = []
for i in range (len(al_list)):
    list.append(S.find(al_list[i]))
for k in range (len(list)):
    print(list[k],end=' ')