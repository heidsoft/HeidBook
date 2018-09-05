STL alg adjacent_find ����

template <class ForwardIterator>
   ForwardIterator adjacent_find ( ForwardIterator first, ForwardIterator last );

template <class ForwardIterator, class BinaryPredicate>
   ForwardIterator adjacent_find ( ForwardIterator first, ForwardIterator last,
                                   BinaryPredicate pred );
�ڽ���������Ԫ��

adjacent_find�㷨���ڲ�����Ȼ������������ڽ�Ԫ�ضԡ��������ֺ���ԭ�ͣ�һ�����ڵ���������[first , last)�ϲ�������������Ԫ�����ʱ����һ����ʹ�ö�Ԫν���ж�pred�����ҵ���������[first , last)������pred�������ڽ�Ԫ�ض� �� 

����ԭ�ͣ� 
template <class ForwardIterator>
   ForwardIterator adjacent_find ( ForwardIterator first, ForwardIterator last )
{
  ForwardIterator next=first; ++next;
  if (first != last)
    while (next != last)
      if (*first++ == *next++)  // or: if (pred(*first++,*next++)), for the pred version
        return first;
  return last;
}

 



����
first, last 
ָ��Ҫ���ҵĵ���������[first,last) 
pred 
�ö�Ԫν��pred��Ϊ���������ҵ���������[first , last)������pred�����жϵ��ڽ�Ԫ�ضԣ���������һ������������ڵ�������operator()�� 

����ֵ
�ҵ��򷵻�Ԫ�ض��е�һ��Ԫ�صĵ�����λ�ã�δ�ҵ��򷵻ص�����ĩλ��last�� 

ʾ������
// adjacent_find example
#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

bool myfunction (int i, int j) {
  return (i==j);
}

int main () {
  int myints[] = {10,20,30,30,20,10,10,20};
  vector<int> myvector (myints,myints+8);
  vector<int>::iterator it;

  // using default comparison:
  it = adjacent_find (myvector.begin(), myvector.end());

  if (it!=myvector.end())
    cout << "the first consecutive repeated elements are: " << *it << endl;

  //using predicate comparison:
  it = adjacent_find (++it, myvector.end(), myfunction);

  if (it!=myvector.end())
    cout << "the second consecutive repeated elements are: " << *it << endl;
  
  return 0;
}

 

���:
the first consecutive repeated elements are: 30the second consecutive repeated elements are: 10
 


