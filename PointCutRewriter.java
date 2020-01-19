// Write out with cheapest on left
Iterator iter = nodes.iterator();
Pointcut result = (Pointcut) iter.next();
while (iter.hasNext()) {
	Pointcut right = (Pointcut) iter.next();
	result = new AndPointcut(result, right);
