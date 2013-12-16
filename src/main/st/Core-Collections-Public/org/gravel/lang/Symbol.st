(reader defineClass: 'Symbol' superclass: 'org.gravel.lang.String')
!
(reader propertyAt: 'javaClass' put: 'org.gravel.core.Symbol')
!
(reader addMethod: 'gravel')
!
< anObject
	<primitive: #('org.gravel.support.jvm.SymbolExtensions' 'sortsLowerThan_')>
	
!
(reader addMethod: 'gravel')
!
= anObject
	^self == anObject
!
(reader addMethod: 'gravel')
!
asString
	<primitive: 'asString'>
	
!
(reader addMethod: 'gravel')
!
asSymbol
	^self
!
(reader addMethod: 'gravel')
!
at: index
	<primitive: #('org.gravel.support.jvm.SymbolExtensions' 'at_')>
	
!
(reader addMethod: 'gravel')
!
copyFrom: start to: stop
	^self asString copyFrom: start to: stop
!
(reader addMethod: 'gravel')
!
do: aBlock
	<primitive: #('org.gravel.support.jvm.SymbolExtensions' 'do_')>
	
!
(reader addMethod: 'gravel')
!
size
	<primitive: #('org.gravel.support.jvm.SymbolExtensions' 'size')>
	
!
(reader addMethod: 'As yet unclassified')
!
tokensBasedOn: anObject
	^self asString tokensBasedOn: anObject
!
(reader addClassMethod: 'As yet unclassified')
!
allStrings
	<primitive: #('org.gravel.support.jvm.SymbolExtensions' 'allStrings')>
	
!
(reader addClassMethod: 'gravel')
!
basicNew
	self error: 'Cannot create symbols'
!
(reader addClassMethod: 'gravel')
!
value: aString
	<primitive: #('org.gravel.support.jvm.SymbolExtensions' 'newInstance_')>
	
!