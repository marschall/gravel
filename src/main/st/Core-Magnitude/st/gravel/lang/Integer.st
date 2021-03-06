(reader defineClass: 'Integer' superclass: 'st.gravel.lang.Number')
!
(reader addMethod: 'gravel')
!
> aMagnitude
	^aMagnitude < self
!
(reader addMethod: 'arithmetic')
!
abs
	^self < 0 ifTrue: [0 - self] ifFalse: [self]
!
(reader addMethod: 'bit manipulation')
!
allMask: mask
	^mask = (self bitAnd: mask)
!
(reader addMethod: 'bit manipulation')
!
anyMask: mask
	^0 ~= (self bitAnd: mask)
!
(reader addMethod: 'converting')
!
asFraction
	^self
!
(reader addMethod: 'converting')
!
asInteger
	^self
!
(reader addMethod: 'converting')
!
asScaledDecimal: scale
	^ScaledDecimal newFromNumber: self scale: scale
!
(reader addMethod: 'As yet unclassified')
!
benchFib
	^self < 2 ifTrue: [1] ifFalse: [(self - 1) benchFib + (self - 2) benchFib + 1]
!
(reader addMethod: 'As yet unclassified')
!
benchmark
	| size flags prime k count |
	size := 8190.
	1 to: self
		do: 
			[:iter |
			count := 0.
			flags := (Array new: size) atAllPut: true.
			1 to: size
				do: 
					[:i |
					(flags at: i)
						ifTrue: 
							[prime := i + 1.
							k := i + prime.
							[k <= size] whileTrue: 
									[flags at: k put: false.
									k := k + prime].
							count := count + 1]]].
	^count
!
(reader addMethod: 'bit manipulation')
!
bitAnd: anObject
	self subclassResponsibility
!
(reader addMethod: 'bit manipulation')
!
bitAt: anInteger
	^(self bitShift: 1 - anInteger) bitAnd: 1
!
(reader addMethod: 'bit manipulation')
!
bitAt: anInteger put: value
	| b |
	b := self bitAt: anInteger.
	b = value ifTrue: [^self].
	0 = value ifTrue: [^self bitAnd: (1 bitShift: anInteger - 1) bitInvert].
	1 = value ifTrue: [^self bitOr: (1 bitShift: anInteger - 1)].
	self error: 'bit value should be 0 or 1'
!
(reader addMethod: 'bit manipulation')
!
bitInvert
	self subclassResponsibility
!
(reader addMethod: 'bit manipulation')
!
bitOr: anObject
	self subclassResponsibility
!
(reader addMethod: 'bit manipulation')
!
bitShift: anObject
	self subclassResponsibility
!
(reader addMethod: 'bit manipulation')
!
bitXor: anObject
	self subclassResponsibility
!
(reader addMethod: 'truncation and round off')
!
ceiling
	^self
!
(reader addMethod: 'private-arithmetic')
!
compressed
	
!
(reader addMethod: 'printing')
!
decimalDigitLength
	^self < 10000
		ifTrue: 
			[self < 100
				ifTrue: [self < 10 ifTrue: [1] ifFalse: [2]]
				ifFalse: [self < 1000 ifTrue: [3] ifFalse: [4]]]
		ifFalse: 
			[self < 1000000
				ifTrue: [self < 100000 ifTrue: [5] ifFalse: [6]]
				ifFalse: 
					[self < 100000000
						ifTrue: [self < 10000000 ifTrue: [7] ifFalse: [8]]
						ifFalse: [self < 1000000000 ifTrue: [9] ifFalse: [10]]]]
!
(reader addMethod: 'accessing')
!
denominator
	^1
!
(reader addMethod: 'private-arithmetic')
!
differenceFromFraction: aFraction
	^(Fraction numerator: aFraction numerator - (aFraction denominator * self)
		denominator: aFraction denominator) reduced
!
(reader addMethod: 'arithmetic')
!
doubleDiv: operand
	^self subclassResponsibility
!
(reader addMethod: 'gravel')
!
factorial
	| tmp |
	tmp := 1.
	2 to: self do: [:i | tmp := tmp * i].
	^tmp
!
(reader addMethod: 'arithmetic')
!
floatDiv: operand
	^self subclassResponsibility
!
(reader addMethod: 'truncation and round off')
!
floor
	^self
!
(reader addMethod: 'truncation and round off')
!
fractionPart
	^0
!
(reader addMethod: 'arithmetic')
!
gcd: operand
	^self subclassResponsibility
!
(reader addMethod: 'As yet unclassified')
!
hashMultiply
	^(self bitAnd: 268435455) hashMultiply
!
(reader addMethod: 'testing')
!
isFraction
	^true
!
(reader addMethod: 'testing')
!
isInteger
	^true
!
(reader addMethod: 'testing')
!
isLarge
	^false
!
(reader addMethod: 'testing')
!
isZero
	^self = 0
!
(reader addMethod: 'arithmetic')
!
lcm: n
	^self // (self gcd: n) * n
!
(reader addMethod: 'comparing')
!
lessFromFraction: aFraction
	^aFraction numerator < (self * aFraction denominator)
!
(reader addMethod: 'mathematical functions')
!
ln
	self > 0 ifTrue: [^super ln].
	^DomainError signal: 'ln is only defined for x > 0'
!
(reader addMethod: 'bit manipulation')
!
noMask: mask
	^0 = (self bitAnd: mask)
!
(reader addMethod: 'printing')
!
numberOfDigitsInBase: b
	b = 10 ifFalse: [^super numberOfDigitsInBase: b].
	self < 0 ifTrue: [^self negated numberOfDigitsInBase: b].
	^self decimalDigitLength
!
(reader addMethod: 'accessing')
!
numerator
	^self
!
(reader addMethod: 'gravel')
!
printBase: base
	self subclassResponsibility
!
(reader addMethod: 'printing')
!
printOn: aStream
	self printOn: aStream base: 10
!
(reader addMethod: 'printing')
!
printOn: stream base: base length: minimumLength padded: padWithZeroes
	| n numberOfDigits totalLength divisor |
	self < 0
		ifTrue: 
			[n := self negated.
			totalLength := 1]
		ifFalse: 
			[n := self.
			totalLength := 0].
	numberOfDigits := n numberOfDigitsInBase: base.
	totalLength := totalLength + numberOfDigits.
	padWithZeroes
		ifFalse: 
			[[totalLength < minimumLength] whileTrue: 
					[stream space.
					totalLength := totalLength + 1]].
	n = self ifFalse: [stream nextPut: $-].
	padWithZeroes
		ifTrue: 
			[[totalLength < minimumLength] whileTrue: 
					[stream nextPut: $0.
					totalLength := totalLength + 1]].
	divisor := base raisedToInteger: numberOfDigits - 1.
	[divisor > 0] whileTrue: 
			[| digit |
			digit := n // divisor.
			stream nextPut: ('0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ' at: digit + 1).
			n := n - (digit * divisor).
			divisor := divisor // base]
!
(reader addMethod: 'printing')
!
printOn: aWriteStream base: anInteger showRadix: aBoolean
	aBoolean
		ifTrue: 
			[anInteger printOn: aWriteStream.
			aWriteStream nextPut: $r].
	self printOn: aWriteStream base: anInteger
!
(reader addMethod: 'printing')
!
printOn: aStream paddedTo: anInteger
	self printOn: aStream paddedWith: $0 to: anInteger
!
(reader addMethod: 'printing')
!
printOn: aStream paddedWith: aCharacter to: anInteger
	self
		printOn: aStream
		paddedWith: aCharacter
		to: anInteger
		base: 10
!
(reader addMethod: 'printing')
!
printOn: aStream paddedWith: aCharacter to: anInteger base: aRadix
	| digitStream digits |
	digitStream := WriteStream on: (String new: 10).
	self printOn: digitStream base: aRadix.
	digits := digitStream contents.
	anInteger - digits size timesRepeat: [aStream nextPut: aCharacter].
	aStream nextPutAll: digits
!
(reader addMethod: 'printing')
!
printStringRadix: radix
	^self printBase: radix
!
(reader addMethod: 'printing')
!
printTruncatedOn: aStream showingDecimalPlaces: placesDesired
	self printOn: aStream.
	placesDesired > 0
		ifTrue: 
			[aStream nextPut: $..
			aStream next: placesDesired put: $0]
!
(reader addMethod: 'private-arithmetic')
!
productFromFraction: aFraction
	self = 0 ifTrue: [^self].
	^(Fraction numerator: aFraction numerator * self denominator: aFraction denominator)
		reduced
!
(reader addMethod: 'private-arithmetic')
!
quotientFromFraction: aFraction
	^aFraction * self reciprocal
!
(reader addMethod: 'private-arithmetic')
!
quotientFromInteger: anInteger
	^(Fraction numerator: anInteger denominator: self) reduced
!
(reader addMethod: 'truncation and round off')
!
rounded
	^self
!
(reader addMethod: 'private-arithmetic')
!
sumFromFraction: aFraction
	^Fraction numerator: aFraction numerator + (aFraction denominator * self)
		denominator: aFraction denominator
!
(reader addMethod: 'As yet unclassified')
!
tinyBenchmarks
	| t1 t2 r n1 n2 |
	n1 := 1.
	
	[t1 := Time millisecondsToRun: [n1 benchmark].
	t1 < 1000] whileTrue: [n1 := n1 * 2].
	n2 := 28.
	
	[t2 := Time millisecondsToRun: [r := n2 benchFib].
	t2 < 1000] whileTrue: [n2 := n2 + 1].
	^(n1 * 500000 * 1000 // t1) printString , ' bytecodes/sec; '
		, (r * 1000 // t2) printString , ' sends/sec'
!
(reader addMethod: 'truncation and round off')
!
truncated
	^self
!
(reader addClassMethod: 'constants')
!
unity
	^1
!
