package org.gravel.support.parser;

/*
	This file is automatically generated. See FX.TService.TService class>>generateWorkspaces
	(C) CosmoCows B.V.
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import org.gravel.support.jvm.NonLocalReturn;
import org.gravel.support.parser.ClassDescriptionNode;
import org.gravel.support.parser.ClassDescriptionNode.ClassDescriptionNode_Factory;
import java.util.HashMap;
import org.gravel.support.parser.VariableDeclarationNode;
import org.gravel.support.parser.SharedDeclarationNode;
import org.gravel.support.parser.MethodNode;
import java.util.Map;
import org.gravel.support.parser.TraitUsageNode;
import org.gravel.support.parser.MetaclassNode;
import org.gravel.support.parser.NodeVisitor;
import org.gravel.support.parser.Diff;
import org.gravel.support.parser.SourceFile;
import org.gravel.support.parser.SystemNode;
import org.gravel.support.parser.AbsoluteReference;
import java.util.Set;
import java.util.HashSet;
import org.gravel.support.parser.Reference;
import org.gravel.support.parser.Node;
import org.gravel.support.parser.SourcePosition;

public class ClassNode extends ClassDescriptionNode implements Cloneable {

	public static ClassNode_Factory factory = new ClassNode_Factory();

	boolean _isExtension;

	boolean _isTrait;

	MetaclassNode _metaclassNode;

	org.gravel.core.Symbol _name;

	org.gravel.core.Symbol[] _namespace;

	Map<String, String> _properties;

	String _superclassPath;

	public static class ClassNode_Factory extends ClassDescriptionNode_Factory {

		public ClassNode basicNew() {
			ClassNode newInstance = new ClassNode();
			newInstance.initialize();
			return newInstance;
		}

		public ClassNode name_namespacePath_(final org.gravel.core.Symbol _aSymbol, final org.gravel.core.Symbol[] _namespacePath) {
			return ((ClassNode) this.name_superclassPath_properties_instVars_classInstVars_sharedVariables_methods_classMethods_namespace_isExtension_isTrait_traitUsage_classTraitUsage_(_aSymbol, null, new java.util.HashMap<String, String>(), new VariableDeclarationNode[] {}, new VariableDeclarationNode[] {}, new SharedDeclarationNode[] {}, new MethodNode[] {}, new MethodNode[] {}, _namespacePath, false, false, EmptyTraitUsageNode.factory.basicNew(), EmptyTraitUsageNode.factory.basicNew()));
		}

		public ClassNode name_superclassPath_properties_instVars_classInstVars_sharedVariables_methods_classMethods_namespace_isExtension_isTrait_traitUsage_classTraitUsage_(final org.gravel.core.Symbol _aSymbol, final String _superclassPath, final Map<String, String> _properties, final VariableDeclarationNode[] _instVars, final VariableDeclarationNode[] _classInstVars, final SharedDeclarationNode[] _sharedVariables, final MethodNode[] _methods, final MethodNode[] _classMethods, final org.gravel.core.Symbol[] _namespace, final boolean _isExtension, final boolean _isTrait, final TraitUsageNode _traitUsage, final TraitUsageNode _classTraitUsage) {
			return this.basicNew().initializeName_superclassPath_properties_instVars_classInstVars_sharedVariables_methods_classMethods_namespace_isExtension_isTrait_traitUsage_classTraitUsage_(_aSymbol, _superclassPath, _properties, _instVars, _classInstVars, _sharedVariables, _methods, _classMethods, _namespace, _isExtension, _isTrait, _traitUsage, _classTraitUsage);
		}
	}

	static public ClassNode _name_namespacePath_(Object receiver, final org.gravel.core.Symbol _aSymbol, final org.gravel.core.Symbol[] _namespacePath) {
		return factory.name_namespacePath_(_aSymbol, _namespacePath);
	}

	static public ClassNode _name_superclassPath_properties_instVars_classInstVars_sharedVariables_methods_classMethods_namespace_isExtension_isTrait_traitUsage_classTraitUsage_(Object receiver, final org.gravel.core.Symbol _aSymbol, final String _superclassPath, final Map<String, String> _properties, final VariableDeclarationNode[] _instVars, final VariableDeclarationNode[] _classInstVars, final SharedDeclarationNode[] _sharedVariables, final MethodNode[] _methods, final MethodNode[] _classMethods, final org.gravel.core.Symbol[] _namespace, final boolean _isExtension, final boolean _isTrait, final TraitUsageNode _traitUsage, final TraitUsageNode _classTraitUsage) {
		return factory.name_superclassPath_properties_instVars_classInstVars_sharedVariables_methods_classMethods_namespace_isExtension_isTrait_traitUsage_classTraitUsage_(_aSymbol, _superclassPath, _properties, _instVars, _classInstVars, _sharedVariables, _methods, _classMethods, _namespace, _isExtension, _isTrait, _traitUsage, _classTraitUsage);
	}

	@Override
	public <X> X accept_(final NodeVisitor<X> _visitor) {
		return _visitor.visitClassNode_(this);
	}

	@Override
	public ClassNode allMethodsIn_do_(final SystemNode _aSystemNode, final org.gravel.support.jvm.Block1<Object, MethodNode> _aBlock) {
		final ClassDescriptionNode _scn;
		for (final MethodNode _temp1 : _methods) {
			_aBlock.value_(_temp1);
		}
		_scn = this.superclassNodeIn_(_aSystemNode);
		if (_scn == null) {
			return ClassNode.this;
		}
		_scn.allMethodsIn_do_(_aSystemNode, _aBlock);
		return this;
	}

	@Override
	public ClassNode allNodesDo_(final org.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		this.nodesDo_(new org.gravel.support.jvm.Block1<Object, Node>() {

			@Override
			public Object value_(final Node _each) {
				return _each.withAllNodesDo_(_aBlock);
			}
		});
		return this;
	}

	@Override
	public ClassNode allNodesDo_pruneWhere_(final org.gravel.support.jvm.Block1<Object, Node> _aBlock, final org.gravel.support.jvm.Block1<Boolean, Node> _pruneBlock) {
		this.nodesDo_(new org.gravel.support.jvm.Block1<Object, Node>() {

			@Override
			public Object value_(final Node _each) {
				if (!_pruneBlock.value_(_each)) {
					return _each.withAllNodesDo_pruneWhere_(_aBlock, _pruneBlock);
				}
				return ClassNode.this;
			}
		});
		return this;
	}

	public ClassNode asTrait() {
		ClassNode _temp1 = this.copy();
		_temp1.pvtSetTrait_(true);
		return _temp1;
	}

	public ClassNode beExtension() {
		ClassNode _temp1 = this.copy();
		_temp1.pvtSetExtension_(true);
		_temp1.pvtSetProperties_(new java.util.HashMap<String, String>());
		return _temp1;
	}

	public MethodNode[] classMethods() {
		return _metaclassNode.methods();
	}

	public TraitUsageNode classTraitUsage() {
		return _metaclassNode.traitUsage();
	}

	public ClassNode copy() {
		try {
			ClassNode _temp1 = (ClassNode) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public ClassNode copyRemoveSelector_(final String _selector) {
		return this.copy().pvtSetMethods_(org.gravel.support.jvm.ArrayExtensions.reject_(_methods, new org.gravel.support.jvm.Predicate1<MethodNode>() {

			@Override
			public boolean value_(final MethodNode _each) {
				return org.gravel.support.jvm.StringExtensions.equals_(_each.selector(), _selector);
			}
		}));
	}

	@Override
	public ClassNode copyReplaceMethodNode_(final MethodNode _aMethodNode) {
		return this.copy().pvtSetMethods_(org.gravel.support.jvm.ArrayExtensions.collect_(_methods, ((org.gravel.support.jvm.Block1<MethodNode, MethodNode>) (new org.gravel.support.jvm.Block1<MethodNode, MethodNode>() {

			@Override
			public MethodNode value_(final MethodNode _each) {
				if (org.gravel.support.jvm.StringExtensions.equals_(_each.selector(), _aMethodNode.selector())) {
					return _aMethodNode;
				} else {
					return _each;
				}
			}
		}))));
	}

	@Override
	public Diff diffFromClassNode_(final ClassNode _oldClassNode) {
		Diff _diff;
		_diff = _oldClassNode.diffToClassDescriptionNode_(this);
		if (!org.gravel.support.jvm.ObjectExtensions.equals_(_name, _oldClassNode.name())) {
			org.gravel.support.jvm.ObjectExtensions.halt(_diff);
		}
		if (!org.gravel.support.jvm.ArrayExtensions.equals_(_namespace, _oldClassNode.namespace())) {
			org.gravel.support.jvm.ObjectExtensions.halt(_diff);
		}
		if (!org.gravel.support.jvm.StringExtensions.equals_(_superclassPath, _oldClassNode.superclassPath())) {
			org.gravel.support.jvm.ObjectExtensions.halt(_diff);
		}
		if (!org.gravel.support.jvm.DictionaryExtensions.equals_(_properties, _oldClassNode.properties())) {
			org.gravel.support.jvm.ObjectExtensions.halt(_diff);
		}
		if (!org.gravel.support.jvm.BooleanExtensions.equals_(_isExtension, _oldClassNode.isExtension())) {
			org.gravel.support.jvm.ObjectExtensions.halt(_diff);
		}
		if (!org.gravel.support.jvm.BooleanExtensions.equals_(_isTrait, _oldClassNode.isTrait())) {
			org.gravel.support.jvm.ObjectExtensions.halt(_diff);
		}
		_diff = _diff.withDiff_(_oldClassNode.metaclassNode().diffTo_(_metaclassNode));
		return _diff;
	}

	@Override
	public Diff diffFromMetaclassNode_(final MetaclassNode _aMetaclassNode) {
		throw new RuntimeException("Should not occur");
	}

	@Override
	public Diff diffTo_(final ClassDescriptionNode _aClassDescriptionNode) {
		return _aClassDescriptionNode.diffFromClassNode_(this);
	}

	@Override
	public boolean equals(final Object _anObject) {
		if (!super.equals(_anObject)) {
			return false;
		}
		if (this._name == null) {
			if (!(((ClassNode) _anObject)._name == null)) {
				return false;
			}
		} else {
			if (!org.gravel.support.jvm.ObjectExtensions.equals_(this._name, ((ClassNode) _anObject)._name)) {
				return false;
			}
		}
		if (this._namespace == null) {
			if (!(((ClassNode) _anObject)._namespace == null)) {
				return false;
			}
		} else {
			if (!org.gravel.support.jvm.ArrayExtensions.equals_(this._namespace, ((ClassNode) _anObject)._namespace)) {
				return false;
			}
		}
		if (this._superclassPath == null) {
			if (!(((ClassNode) _anObject)._superclassPath == null)) {
				return false;
			}
		} else {
			if (!org.gravel.support.jvm.StringExtensions.equals_(this._superclassPath, ((ClassNode) _anObject)._superclassPath)) {
				return false;
			}
		}
		if (this._properties == null) {
			if (!(((ClassNode) _anObject)._properties == null)) {
				return false;
			}
		} else {
			if (!org.gravel.support.jvm.DictionaryExtensions.equals_(this._properties, ((ClassNode) _anObject)._properties)) {
				return false;
			}
		}
		if (!org.gravel.support.jvm.BooleanExtensions.equals_(this._isExtension, ((ClassNode) _anObject)._isExtension)) {
			return false;
		}
		if (this._metaclassNode == null) {
			if (!(((ClassNode) _anObject)._metaclassNode == null)) {
				return false;
			}
		} else {
			if (!org.gravel.support.jvm.ObjectExtensions.equals_(this._metaclassNode, ((ClassNode) _anObject)._metaclassNode)) {
				return false;
			}
		}
		if (!org.gravel.support.jvm.BooleanExtensions.equals_(this._isTrait, ((ClassNode) _anObject)._isTrait)) {
			return false;
		}
		return true;
	}

	public ClassNode_Factory factory() {
		return factory;
	}

	@Override
	public SourceFile findSourceFile() {
		if (_sourcePosition != null) {
			return _sourcePosition.sourceFile();
		}
		if (_metaclassNode.sourcePosition() == null) {
			return null;
		}
		return _metaclassNode.sourcePosition().sourceFile();
	}

	@Override
	public ClassNode flattenTraitsIn_(final SystemNode _aSystemNode) {
		final MetaclassNode _newMetaclassNode;
		final ClassNode _newClassNode;
		_newMetaclassNode = _metaclassNode.flattenTraitsIn_(_aSystemNode);
		_newClassNode = _traitUsage.flattenClassNode_in_(this, _aSystemNode);
		if ((_newClassNode == this) && (_newMetaclassNode == _metaclassNode)) {
			return ClassNode.this;
		}
		return _newClassNode.copy().pvtSetMetaclassNode_(_newMetaclassNode);
	}

	@Override
	public int hashCode() {
		return ((((super.hashCode() ^ (_name == null ? 0 : _name.hashCode())) ^ java.util.Arrays.hashCode(_namespace)) ^ _superclassPath.hashCode()) ^ _properties.hashCode());
	}

	@Override
	public ClassNode initializeMethods_instVars_(final MethodNode[] _anOrderedCollection, final VariableDeclarationNode[] _anArray) {
		_methods = _anOrderedCollection;
		_instVars = _anArray;
		this.initialize();
		return this;
	}

	public ClassNode initializeName_superclassPath_properties_instVars_classInstVars_sharedVariables_methods_classMethods_namespace_isExtension_isTrait_traitUsage_classTraitUsage_(final org.gravel.core.Symbol _aSymbol, final String _aString, final Map<String, String> _aDictionary, final VariableDeclarationNode[] _anArray, final VariableDeclarationNode[] _classInstVars, final SharedDeclarationNode[] _sharedVariables, final MethodNode[] _anOrderedCollection, final MethodNode[] _classMethods, final org.gravel.core.Symbol[] _anArray2, final boolean _aBoolean, final boolean _aBoolean2, final TraitUsageNode _aTraitUsageNode, final TraitUsageNode _classTraitUsage) {
		_name = _aSymbol;
		_superclassPath = _aString;
		_properties = _aDictionary;
		_instVars = _anArray;
		_methods = _anOrderedCollection;
		_namespace = _anArray2;
		_isExtension = _aBoolean;
		_isTrait = _aBoolean2;
		_traitUsage = _aTraitUsageNode;
		_metaclassNode = MetaclassNode.factory.classNode_methods_instVars_sharedVariables_traitUsage_(this, _classMethods, _classInstVars, _sharedVariables, _classTraitUsage);
		this.initialize();
		return this;
	}

	@Override
	public boolean isClassNode() {
		return true;
	}

	public boolean isExtension() {
		return _isExtension;
	}

	@Override
	public boolean isNilClass() {
		final String _isNilClass;
		String _temp1 = _properties.get("isNilClass");
		_isNilClass = ((String) _temp1);
		return org.gravel.support.jvm.StringExtensions.equals_(_isNilClass, "true");
	}

	@Override
	public boolean isTrait() {
		return _isTrait;
	}

	public org.gravel.core.Symbol[] javaClassPath() {
		final Object _temp1 = new Object();
		try {
			final String _javaClass;
			_javaClass = ((String) org.gravel.support.jvm.DictionaryExtensions.at_ifAbsent_(_properties, "javaClass", ((org.gravel.support.jvm.Block0<String>) (new org.gravel.support.jvm.Block0<String>() {

				@Override
				public String value() {
					throw new NonLocalReturn(null, _temp1);
				}
			}))));
			return ((org.gravel.core.Symbol[]) org.gravel.support.jvm.ArrayExtensions.collect_(org.gravel.support.jvm.StringExtensions.tokensBasedOn_(_javaClass, '.'), ((org.gravel.support.jvm.Block1<org.gravel.core.Symbol, String>) (new org.gravel.support.jvm.Block1<org.gravel.core.Symbol, String>() {

				@Override
				public org.gravel.core.Symbol value_(final String _each) {
					return (org.gravel.core.Symbol) org.gravel.core.Symbol.value(_each);
				}
			}))));
		} catch (NonLocalReturn nlr) {
			if (nlr.marker == _temp1) {
				return (org.gravel.core.Symbol[]) nlr.returnValue;
			} else {
				throw nlr;
			}
		}
	}

	public AbsoluteReference javaClassReference() {
		final org.gravel.core.Symbol[] _path;
		_path = this.javaClassPath();
		if (_path == null) {
			return null;
		}
		return AbsoluteReference.factory.path_(_path);
	}

	@Override
	public ClassNode localVarNamesDo_(final org.gravel.support.jvm.Block1<Object, String> _aBlock) {
		return this;
	}

	public ClassNode mergedWithExtension_(final ClassNode _aClassNode) {
		return this.withMethods_classMethods_isExtension_(this.mergeMethods_with_(_methods, _aClassNode.methods()), this.mergeMethods_with_(this.classMethods(), _aClassNode.classMethods()), false);
	}

	public ClassNode mergedWithMethods_(final MethodNode[] _anArray) {
		return this.withMethods_(this.mergeMethods_with_(_methods, _anArray));
	}

	public MethodNode[] mergeMethods_with_(final MethodNode[] _originalMethods, final MethodNode[] _extensionMethods) {
		final java.util.Set<String> _s;
		_s = new java.util.HashSet();
		for (final MethodNode _m : _originalMethods) {
			_s.add(_m.selector());
		}
		for (final MethodNode _m : _extensionMethods) {
			if (_s.contains(_m.selector())) {
				throw new RuntimeException("Override: " + _m.selector());
			}
		}
		return org.gravel.support.jvm.ArrayExtensions.copyWithAll_(_originalMethods, _extensionMethods);
	}

	@Override
	public MetaclassNode meta() {
		return _metaclassNode;
	}

	public MetaclassNode metaclassNode() {
		return _metaclassNode;
	}

	@Override
	public org.gravel.core.Symbol name() {
		return _name;
	}

	@Override
	public org.gravel.core.Symbol[] namespace() {
		return _namespace;
	}

	@Override
	public ClassNode nodesDo_(final org.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		for (final MethodNode _temp1 : _methods) {
			_aBlock.value_(_temp1);
		}
		for (final VariableDeclarationNode _temp2 : _instVars) {
			_aBlock.value_(_temp2);
		}
		return this;
	}

	@Override
	public org.gravel.core.Symbol packageName() {
		final org.gravel.core.Symbol _sp;
		final String _pnString;
		_sp = super.packageName();
		if (_sp != null) {
			return _sp;
		}
		String _temp1 = _properties.get("packageName");
		_pnString = ((String) _temp1);
		if (_pnString == null) {
			return null;
		}
		return org.gravel.core.Symbol.value(_pnString);
	}

	public ClassNode postCopy() {
		_metaclassNode = MetaclassNode.factory.classNode_methods_instVars_sharedVariables_traitUsage_(this, _metaclassNode.methods(), _metaclassNode.instVars(), _metaclassNode.sharedVariables(), _metaclassNode.traitUsage());
		return this;
	}

	@Override
	public ClassNode prettySourceOn_(final StringBuilder _aStream) {
		SourcePrinter.factory.on_(_aStream).visit_(this);
		return this;
	}

	@Override
	public ClassNode printOn_(final StringBuilder _aStream) {
		final String _title;
		_title = this.factory().toString();
		_aStream.append(org.gravel.support.jvm.CharacterExtensions.isVowel(_title.charAt(0)) ? "an " : "a ");
		_aStream.append(_title);
		_aStream.append('[');
		this.sourceOn_(_aStream);
		_aStream.append(']');
		return this;
	}

	public Map<String, String> properties() {
		return _properties;
	}

	public ClassNode pvtSetClassMethods_(final MethodNode[] _anArray) {
		return this.pvtSetMetaclassNode_(_metaclassNode.withMethods_(_anArray));
	}

	public ClassNode pvtSetExtension_(final boolean _aBoolean) {
		_isExtension = _aBoolean;
		return this;
	}

	@Override
	public ClassNode pvtSetInstVars_(final VariableDeclarationNode[] _arr) {
		_instVars = _arr;
		return this;
	}

	public ClassNode pvtSetMetaclassNode_(final MetaclassNode _aMetaclassNode) {
		if (_metaclassNode == _aMetaclassNode) {
			return ClassNode.this;
		}
		_metaclassNode = _aMetaclassNode.pvtWithClassNode_(this);
		return this;
	}

	@Override
	public ClassNode pvtSetMethods_(final MethodNode[] _anArray) {
		_methods = _anArray;
		return this;
	}

	public ClassNode pvtSetProperties_(final Map<String, String> _aDictionary) {
		_properties = _aDictionary;
		return this;
	}

	@Override
	public ClassNode pvtSetSourcePosition_(final SourcePosition _aSourcePosition) {
		_sourcePosition = _aSourcePosition;
		return this;
	}

	public ClassNode pvtSetSuperclassPath_(final String _aString) {
		_superclassPath = _aString;
		return this;
	}

	@Override
	public ClassNode pvtSetTraitUsage_(final TraitUsageNode _aTraitUsageNode) {
		_traitUsage = _aTraitUsageNode;
		return this;
	}

	public ClassNode pvtSetTrait_(final boolean _aBoolean) {
		_isTrait = _aBoolean;
		return this;
	}

	@Override
	public AbsoluteReference reference() {
		return AbsoluteReference.factory.path_(org.gravel.support.jvm.ArrayExtensions.copyWith_(_namespace, _name));
	}

	@Override
	public ClassNode selectorsDo_(final org.gravel.support.jvm.Block1<Object, String> _aBlock) {
		for (final MethodNode _m : _methods) {
			_aBlock.value_(_m.selector());
		}
		return this;
	}

	@Override
	public ClassNode sourceOn_(final StringBuilder _aStream) {
		_aStream.append(_name);
		if (_isExtension) {
			_aStream.append(" (extension)");
		}
		if (_isTrait) {
			_aStream.append(" (trait)");
		}
		return this;
	}

	public String superclassPath() {
		return _superclassPath;
	}

	@Override
	public Reference superclassReference() {
		final org.gravel.core.Symbol[] _path;
		if (_superclassPath == null) {
			return null;
		}
		_path = org.gravel.support.jvm.ArrayExtensions.collect_(org.gravel.support.jvm.StringExtensions.tokensBasedOn_(_superclassPath, '.'), ((org.gravel.support.jvm.Block1<org.gravel.core.Symbol, String>) (new org.gravel.support.jvm.Block1<org.gravel.core.Symbol, String>() {

			@Override
			public org.gravel.core.Symbol value_(final String _str) {
				return (org.gravel.core.Symbol) org.gravel.core.Symbol.value(_str);
			}
		})));
		if (org.gravel.support.jvm.IntegerExtensions.equals_(_path.length, 1)) {
			return AbsoluteReference.factory.path_(org.gravel.support.jvm.ArrayExtensions.copyWith_(_namespace, _path[0]));
		}
		return AbsoluteReference.factory.path_(_path);
	}

	@Override
	public ClassNode withAllNodesDo_(final org.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		_aBlock.value_(this);
		this.allNodesDo_(_aBlock);
		return this;
	}

	@Override
	public ClassNode withAllNodesDo_pruneWhere_(final org.gravel.support.jvm.Block1<Object, Node> _aBlock, final org.gravel.support.jvm.Block1<Boolean, Node> _pruneBlock) {
		_aBlock.value_(this);
		this.allNodesDo_pruneWhere_(_aBlock, _pruneBlock);
		return this;
	}

	public ClassNode withClassInstVar_(final VariableDeclarationNode _aVariableDeclarationNode) {
		return this.copy().pvtSetMetaclassNode_(_metaclassNode.withInstVar_(_aVariableDeclarationNode));
	}

	public ClassNode withClassMethodNode_(final MethodNode _aMethodNode) {
		return this.copy().pvtSetMetaclassNode_(_metaclassNode.withMethodNode_(_aMethodNode));
	}

	@Override
	public ClassNode withInstVar_(final VariableDeclarationNode _aVariableDeclarationNode) {
		return this.copy().pvtSetInstVars_(org.gravel.support.jvm.ArrayExtensions.copyWith_(_instVars, _aVariableDeclarationNode));
	}

	@Override
	public ClassNode withMethodNode_(final MethodNode _aMethodNode) {
		final MethodNode _current;
		_current = this.methodOrNilAt_(_aMethodNode.selector());
		if (_current != null) {
			throw new RuntimeException("Duplicate selector: " + _aMethodNode.selector());
		}
		return this.copy().pvtSetMethods_(org.gravel.support.jvm.ArrayExtensions.copyWith_(_methods, _aMethodNode));
	}

	@Override
	public ClassNode withMethodNode_ofTrait_(final MethodNode _aMethodNode, final Reference _aReference) {
		return this.withMethodNode_(_aMethodNode.ofTrait_(_aReference));
	}

	@Override
	public ClassNode withMethods_(final MethodNode[] _anArray) {
		return this.copy().pvtSetMethods_(_anArray);
	}

	public ClassNode withMethods_classMethods_isExtension_(final MethodNode[] _anArray, final MethodNode[] _anArray2, final boolean _aBoolean) {
		ClassNode _temp1 = this.copy();
		_temp1.pvtSetMethods_(_anArray);
		_temp1.pvtSetClassMethods_(_anArray2);
		_temp1.pvtSetExtension_(_aBoolean);
		return _temp1;
	}

	public ClassNode withProperties_(final Map<String, String> _aDictionary) {
		return this.copy().pvtSetProperties_(_aDictionary);
	}

	public ClassNode withPropertyAt_put_(final String _aKey, final String _aValue) {
		return this.withProperties_(org.gravel.support.jvm.DictionaryExtensions.copyAt_put_(_properties, _aKey, _aValue));
	}

	public ClassNode withSharedVariable_(final SharedDeclarationNode _aSharedDeclarationNode) {
		return this.copy().pvtSetMetaclassNode_(_metaclassNode.withSharedVariable_(_aSharedDeclarationNode));
	}

	@Override
	public ClassNode withSourcePosition_(final SourcePosition _aSourcePosition) {
		if (_sourcePosition == _aSourcePosition) {
			return ClassNode.this;
		}
		return this.copy().pvtSetSourcePosition_(_aSourcePosition);
	}

	public ClassNode withSuperclassPath_(final String _aString) {
		return this.copy().pvtSetSuperclassPath_(_aString);
	}

	@Override
	public ClassNode withTrait_(final TraitUsageNode _aTraitUsageNode) {
		return this.copy().pvtSetTraitUsage_(_traitUsage.withTrait_(_aTraitUsageNode));
	}
}