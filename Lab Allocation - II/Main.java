#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  string d;
  cin>>a>>b>>c>>d;
  if(d == "L3"){
  	c = 10000;
  }
  if(d == "L2"){
  	b = 10000;
  }
  if(d == "L1"){
  	a = 10000;
  }
  if(a<b){
  	if(a<c){
    	cout<<"L1";
    }
    else{
    	cout<<"L3";
    }
  }
  else{
    if(b<c){
    	cout<<"L2";
    }
    else{
    	cout<<"L3";
    }
    }
}