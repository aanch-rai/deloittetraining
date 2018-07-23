Difference between Comparable and Comparator:-
1.Comparable : Implement Comaprable in same class --ie CustomerList
2.Must Override compareTo(if it is a String use compareTo i.e if((this.getCustomerName().compareTo(o.getCustomerName()))>0) 
if we are comparing integers, can use this.customerid
3.Sorting can be done once based on any one field only. It is fixed prior.
4.Call the sort using Collections.sort(allCustomers) where allCustomers is the list in main.


COMPARATOR:-
1.Implement Comparator example 'CustomerAddressComparator' in different class. { create new class+ name=CustomerAddressComparator +add library Comparator<CustomerList>}
2.Override compare method in the comparator class created.
3.Here, user can choose what field of the object to sort, it is the wish of the user as we have different classes we have options.
4.Call the sort using Collections.sort(allCustomers, default_constructor_of_the_comparator_class).


