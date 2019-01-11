#include<iostream>
#include<string>
using namespace std;


//
//	NO Additional Data Structure used. Only string and its functions are used.
//
int main()
{

	cout<<"Enter String: ";
	
	string str;
	
	cin>>str;
	
	int flag=0;
	
	for(int i=0;i<str.length();i++)
	{
		
		if(str.find_last_of(str[i])!=i)
		{
			cout<<"Duplicate character : "<<str[i]<<" found!! "<<endl;
			flag++;
		}
		
	}

	if(!flag)
	{
		cout<<"All unique characters present. "<<endl;
	}


return 0;
}
