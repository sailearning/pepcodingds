# asf is the subset
# sos is sum of subset
# tar is target
def printTargetSumSubsets(arr,idx,asf,sos,tar):
    if(idx == len(arr)):
        if(sos == tar):
            print(asf+".")
        return

    if(sos > tar):
        return

    printTargetSumSubsets(arr,idx+1,str(asf)+str(arr[idx])+", ",sos+arr[idx],tar)
    printTargetSumSubsets(arr,idx+1,asf,sos,tar)
  

def main():
    n = int(input());
    arr = []
    for i in range(n):
        arr.append(int(input()));
    
    tar = int(input());
    printTargetSumSubsets(arr,0,"",0,tar)
    
main()