(reader extendClass: 'Object')
!
(reader addMethod: 'associating')
!
-> anObject
	^Association key: self value: anObject
!
(reader addMethod: 'testing')
!
isArray
	^false
!
(reader addMethod: 'testing')
!
isBag
	^false
!
(reader addMethod: 'testing')
!
isByteArray
	^false
!
(reader addMethod: 'testing')
!
isCollection
	^false
!
(reader addMethod: 'testing')
!
isDictionary
	^false
!
(reader addMethod: 'testing')
!
isIdentityDictionary
	^false
!
(reader addMethod: 'testing')
!
isInterval
	^false
!
(reader addMethod: 'testing')
!
isOrderedCollection
	^false
!
(reader addMethod: 'testing')
!
isReadStream
	^false
!
(reader addMethod: 'testing')
!
isReadWriteStream
	^false
!
(reader addMethod: 'testing')
!
isSequencedReadable
	^false
!
(reader addMethod: 'testing')
!
isSet
	^false
!
(reader addMethod: 'testing')
!
isSortedCollection
	^false
!
(reader addMethod: 'testing')
!
isSymbol
	^false
!
(reader addMethod: 'testing')
!
isWriteStream
	^false
!
(reader addMethod: 'comparing')
!
scaledIdentityHash
	^self identityHash bitShift: 18
!
