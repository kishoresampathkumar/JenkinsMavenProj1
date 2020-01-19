// Write out with cheapest on left
Iterator<Pointcut> iter = nodes.iterator();
Pointcut result = iter.next();
while (iter.hasNext()) {
	Pointcut right = iter.next();
	result = new AndPointcut(result, right);
