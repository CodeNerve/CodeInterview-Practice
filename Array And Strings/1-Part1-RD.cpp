#include<iostream>
#include<map>
#include<string>
using namespace std;
//
// Using map as an extra data-structure
//
int main()
{

	cout<<"Enter String: ";
	
	string str;
	
	cin>>str;
	
	map <char,int> occur;
	int flag=0;
	
	for(int i=0;i<str.length();i++)
	{
		occur[str[i]]++;
		
		if(occur[str[i]]>1)
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
