(reader defineClass: 'PushTrue' superclass: 'org.gravel.support.compiler.jvm.PushBoolean')
!
(reader addMethod: 'visitor')
!
accept: visitor {JVMInstructionVisitor[X def]} {^X}
	^visitor visitPushTrue: self
!