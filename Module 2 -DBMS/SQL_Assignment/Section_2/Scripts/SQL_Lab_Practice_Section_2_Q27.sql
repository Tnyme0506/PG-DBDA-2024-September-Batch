# 27. List the number of employees directly reporting to ‘Reddy’

select * from emp
where supcode = (select empcode from emp where empname = 'Reddy')