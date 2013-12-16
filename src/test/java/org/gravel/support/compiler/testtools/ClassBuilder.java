package org.gravel.support.compiler.testtools;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.gravel.core.Symbol;
import org.gravel.support.jvm.runtime.ImageBootstrapper;
import org.gravel.support.parser.ClassNode;
import org.gravel.support.parser.EmptyTraitUsageNode;
import org.gravel.support.parser.MethodNode;
import org.gravel.support.parser.Parser;
import org.gravel.support.parser.SharedDeclarationNode;
import org.gravel.support.parser.SystemDefinitionNode;
import org.gravel.support.parser.SystemNode;
import org.gravel.support.parser.VariableDeclarationNode;

public class ClassBuilder {

	private final String name;
	private String superclassName = "org.gravel.lang.Object";
	private final ArrayList<MethodNode> methods = new ArrayList<>();
	private final ArrayList<MethodNode> classMethods = new ArrayList<>();
	private final ArrayList<VariableDeclarationNode> instVars = new ArrayList<>();

	public ClassBuilder(String name) {
		this.name = name;
	}

	public ClassBuilder method(String source) {
		methods.add(Parser.factory.parseMethod_(source));
		return this;
	}

	public ClassBuilder superclassName(String superclassName) {
		this.superclassName = superclassName;
		return this;
	}

	public ClassBuilder classMethod(String source) {
		classMethods.add(Parser.factory.parseMethod_(source));
		return this;
	}

	public ClassBuilder instVar(String string) {
		instVars.add(VariableDeclarationNode.factory.name_(string));
		return this;
	}

	public Class build() {
		Map<String, String> _properties = new HashMap<>();
		VariableDeclarationNode[] _instVars = instVars
				.toArray(new VariableDeclarationNode[instVars.size()]);
		VariableDeclarationNode[] _classInstVars = new VariableDeclarationNode[0];
		MethodNode[] _methods = methods.toArray(new MethodNode[methods.size()]);
		MethodNode[] _classMethods = classMethods
				.toArray(new MethodNode[classMethods.size()]);
		ClassNode classNode = ClassNode.factory
				.name_superclassPath_properties_instVars_classInstVars_sharedVariables_methods_classMethods_namespace_isExtension_isTrait_traitUsage_classTraitUsage_(
						Symbol.value(name), superclassName, _properties,
						_instVars, _classInstVars,
						new SharedDeclarationNode[0], _methods, _classMethods,
						new Symbol[0], false, false,
						EmptyTraitUsageNode.factory.basicNew(),
						EmptyTraitUsageNode.factory.basicNew());
		SystemDefinitionNode systemDefinitionNode = ImageBootstrapper.systemMapping
				.systemDefinitionNode();
		ImageBootstrapper.systemMapping.updateTo_(systemDefinitionNode
				.withPackageNamed_classNode_(Symbol.value(name), classNode));
		return ImageBootstrapper.systemMapping.classMappingAtReference_(
				classNode.reference()).identityClass();
	}

}