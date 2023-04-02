#include <bits/stdc++.h>
#define empback emplace_back
using namespace std;

vector<int> mulSingle(vector<int> v,int a){
	int n=v.size(),c=0;
	for(int i=0;i<n;i++){
		int d=v[i]*a+c;
		c=d/10;
		d%=10;
		v[i]=d;
	}
	while(c>0){
		v.empback(c%10);
		c/=10;
	}
	return v;
}

vector<int> factorial(int n){
	vector<int> res;
	res.empback(1);
	if(n<2)
		return res;
	for(int i=2;i<=n;i++){
		res = mulSingle(res,i);
	}
	return res;
}

int main(){
	vector<int> v=factorial(15);
	int n=v.size();
	int l=0,r=n-1;
	while(l<r){
		int temp=v[l];
		v[l]=v[r];
		v[r]=temp;
		l++;
		r--;
	}
	for(auto x:v)
		cout<<x;
	cout<<endl;
}
