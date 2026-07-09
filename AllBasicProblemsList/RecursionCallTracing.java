package AllBasicProblemsList;

public class RecursionCallTracing{

    // ans = 243
    static int bar(int x, int y){
        if (y == 0)
            return 0;
        return x + bar(x, y-1);
    }

    static int foo(int x, int y){
        if (y == 0)
            return 1;
        return bar(x, foo(x, y-1));
    }

    public static void main(String[] args){
        System.out.println(foo(3,5)); // function is getting invoked here
    }
}


// dry run
// first it goes to foo and then calculates until  y=0 and returns 1
// foo(3,0) = 1

// then bar(3,1) // as foo(3,0) returned 1 we go to bar
// and then 3+bar(3,0) when y=0 returns 0 so
// 3+0=3
// foo(3,1)=3

// next step
// foo(3,2)
// = bar(3,3) as foo(3,1)=3 

// 3+bar(3, 2) =3+6=9
// 3+bar(3,1) then going up here from below = 3+3=6
//3+bar(3,0) returns 0 = 3+0=3
// = 9 (so here we get 9)
// here we can see a pattern 
// 3^0=1
// 3^1=3
// 3^2=9
// so as x=3 and y=5
// 3^5=243  final ans=243

// if we continue to follow same steps below to we will get 
// the answer

// foo(3,3)
// = bar(3,9)
// = 27

// foo(3,4)
// = bar(3,27)
// = 81

// foo(3,5)
// = bar(3,81)
// = 243