<?xml version="1.0" encoding="UTF-8"?><!--Designed and generated by Altova StyleVision Enterprise Edition 2014 (x64) - see http://www.altova.com/stylevision for more information.--><xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:altova="http://www.altova.com" xmlns:altovaext="http://www.altova.com/xslt-extensions" xmlns:clitype="clitype" xmlns:fn="http://www.w3.org/2005/xpath-functions" xmlns:iso4217="http://www.xbrl.org/2003/iso4217" xmlns:ix="http://www.xbrl.org/2008/inlineXBRL" xmlns:java="java" xmlns:link="http://www.xbrl.org/2003/linkbase" xmlns:n1="http://oracle.com/datamodeler/reports/tablesviews" xmlns:sps="http://www.altova.com/StyleVision/user-xpath-functions" xmlns:xbrldi="http://xbrl.org/2006/xbrldi" xmlns:xbrli="http://www.xbrl.org/2003/instance" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" exclude-result-prefixes="altova altovaext clitype fn iso4217 ix java link n1 sps xbrldi xbrli xlink xs xsd xsi">	<xsl:output version="4.0" method="html" indent="no" encoding="UTF-8" doctype-public="-//W3C//DTD HTML 4.01 Transitional//EN" doctype-system="http://www.w3.org/TR/html4/loose.dtd"/>	<xsl:param name="SV_OutputFormat" select="'HTML'"/>	<xsl:param name="p1"/>	<xsl:param name="p2"/>	<xsl:variable name="XML" select="/"/>	<xsl:variable name="altova:nPxPerIn" select="96"/>	<xsl:template match="/">		<html>			<head>				<title/>				<meta name="generator" content="Altova StyleVision Enterprise Edition 2014 (x64) (http://www.altova.com)"/>				<meta http-equiv="X-UA-Compatible" content="IE=7"/>                <xsl:value-of select="normalize-space(concat('&lt;link rel=&quot;stylesheet&quot; type=&quot;text/css&quot; href=&quot;', $p1, '&quot;>'))" disable-output-escaping="yes"/>                <xsl:value-of select="normalize-space(concat('&lt;link rel=&quot;stylesheet&quot; type=&quot;text/css&quot; href=&quot;', $p2, '&quot;>'))" disable-output-escaping="yes"/>				<xsl:comment>[if IE]&gt;&lt;STYLE type=&quot;text/css&quot;&gt;.altova-rotate-left-textbox{filter: progid:DXImageTransform.Microsoft.BasicImage(rotation=3)} .altova-rotate-right-textbox{filter: progid:DXImageTransform.Microsoft.BasicImage(rotation=1)} &lt;/STYLE&gt;&lt;![endif]</xsl:comment>				<xsl:comment>[if !IE]&gt;&lt;!</xsl:comment>				<style type="text/css">.altova-rotate-left-textbox{-webkit-transform: rotate(-90deg) translate(-100%, 0%); -webkit-transform-origin: 0% 0%;-moz-transform: rotate(-90deg) translate(-100%, 0%); -moz-transform-origin: 0% 0%;-ms-transform: rotate(-90deg) translate(-100%, 0%); -ms-transform-origin: 0% 0%;}.altova-rotate-right-textbox{-webkit-transform: rotate(90deg) translate(0%, -100%); -webkit-transform-origin: 0% 0%;-moz-transform: rotate(90deg) translate(0%, -100%); -moz-transform-origin: 0% 0%;-ms-transform: rotate(90deg) translate(0%, -100%); -ms-transform-origin: 0% 0%;}</style>				<xsl:comment>&lt;![endif]</xsl:comment>				<style type="text/css">@page { margin-left:2cm; margin-right:2cm; margin-top:2cm; margin-bottom:2cm } @media print { br.altova-page-break { page-break-before: always; } }</style>			</head>			<body style="font-family:Tahoma; font-size:xx-small; ">				<xsl:for-each select="$XML">					<xsl:for-each select="n1:TablesViews">						<center style="text-align:center; ">							<xsl:for-each select="n1:ReportCaption">								<span class="caption">									<xsl:apply-templates/>								</span>							</xsl:for-each>						</center>						<p/>						<table class="w_20">							<xsl:variable name="altova:CurrContextGrid_0" select="."/>							<tbody>								<tr>									<td class="td_h_v w_4">										<span>											<xsl:text>Design Name</xsl:text>										</span>									</td>									<td class="td w_16">										<xsl:for-each select="n1:DesignName">											<xsl:apply-templates/>										</xsl:for-each>									</td>								</tr>								<tr>									<td class="td_h_v">										<span>											<xsl:text>Version Date</xsl:text>										</span>									</td>									<td class="td">										<xsl:for-each select="n1:VersionDate">											<xsl:apply-templates/>										</xsl:for-each>									</td>								</tr>								<tr>									<td class="td_h_v">										<span>											<xsl:text>Version Comment</xsl:text>										</span>									</td>									<td class="td">										<xsl:for-each select="n1:VersionComment">											<xsl:apply-templates/>										</xsl:for-each>									</td>								</tr>								<tr>									<td class="td_h_v">										<span>											<xsl:text>Model Name</xsl:text>										</span>									</td>									<td class="td">										<xsl:for-each select="n1:ModelName">											<xsl:apply-templates/>										</xsl:for-each>									</td>								</tr>							</tbody>						</table>						<xsl:if test="count(n1:SubViewsCollection)">							<p/>							<span class="t_cap">								<xsl:text>SubViews</xsl:text>							</span>							<br/>							<table class="w_25">								<xsl:variable name="altova:CurrContextGrid_1" select="."/>								<thead>									<tr>										<th class="td_h_h w_4">											<span>												<xsl:text>SubView</xsl:text>											</span>										</th>										<th class="td_h_h w_7p5">											<span>												<xsl:text>Description</xsl:text>											</span>										</th>										<th class="td_h_h w_7p5">											<span>												<xsl:text>Notes</xsl:text>											</span>										</th>										<th class="td_h_h w_6">											<span>												<xsl:text>Object</xsl:text>											</span>										</th>									</tr>								</thead>								<tbody>									<xsl:for-each select="n1:SubViewsCollection">										<xsl:for-each select="n1:SubViewsDetails">											<tr>												<td class="td_h_v">													<xsl:choose>														<xsl:when test="$SV_OutputFormat = &apos;HTML&apos;">															<xsl:choose>																<xsl:when test="contains( . ,  &apos;.pdf&apos; )">																	<xsl:for-each select="n1:SWName">																		<a>																			<xsl:choose>																				<xsl:when test="not(string(.))">																					<xsl:attribute name="href">																						<xsl:text>#</xsl:text>																					</xsl:attribute>																				</xsl:when>																				<xsl:when test="substring(string(.), 1, 1) = '#'">																					<xsl:attribute name="href">																						<xsl:value-of select="."/>																					</xsl:attribute>																				</xsl:when>																				<xsl:otherwise>																					<xsl:attribute name="href">																						<xsl:if test="substring(string(.), 2, 1) = ':'">																							<xsl:text>file:///</xsl:text>																						</xsl:if>																						<xsl:value-of select="translate(string(.), '&#x5c;', '/')"/>																					</xsl:attribute>																				</xsl:otherwise>																			</xsl:choose>																			<span>																				<xsl:value-of select="substring-after( . ,&apos;/&apos;)"/>																			</span>																		</a>																	</xsl:for-each>																</xsl:when>																<xsl:otherwise>																	<xsl:for-each select="n1:SWName">																		<a>																			<xsl:choose>																				<xsl:when test="not(string(concat(&apos;#&apos;,../n1:SWDiagramLink)))">																					<xsl:attribute name="href">																						<xsl:text>#</xsl:text>																					</xsl:attribute>																				</xsl:when>																				<xsl:when test="substring(string(concat(&apos;#&apos;,../n1:SWDiagramLink)), 1, 1) = '#'">																					<xsl:attribute name="href">																						<xsl:value-of select="concat(&apos;#&apos;,../n1:SWDiagramLink)"/>																					</xsl:attribute>																				</xsl:when>																				<xsl:otherwise>																					<xsl:attribute name="href">																						<xsl:if test="substring(string(concat(&apos;#&apos;,../n1:SWDiagramLink)), 2, 1) = ':'">																							<xsl:text>file:///</xsl:text>																						</xsl:if>																						<xsl:value-of select="translate(string(concat(&apos;#&apos;,../n1:SWDiagramLink)), '&#x5c;', '/')"/>																					</xsl:attribute>																				</xsl:otherwise>																			</xsl:choose>																			<xsl:apply-templates/>																		</a>																		<br/>																	</xsl:for-each>																</xsl:otherwise>															</xsl:choose>														</xsl:when>														<xsl:otherwise>															<xsl:choose>																<xsl:when test="contains( . ,  &apos;.pdf&apos; )">																	<xsl:for-each select="n1:SWName">																		<a>																			<xsl:choose>																				<xsl:when test="not(string(../n1:SWDiagramLink))">																					<xsl:attribute name="href">																						<xsl:text>#</xsl:text>																					</xsl:attribute>																				</xsl:when>																				<xsl:when test="substring(string(../n1:SWDiagramLink), 1, 1) = '#'">																					<xsl:attribute name="href">																						<xsl:value-of select="../n1:SWDiagramLink"/>																					</xsl:attribute>																				</xsl:when>																				<xsl:otherwise>																					<xsl:attribute name="href">																						<xsl:if test="substring(string(../n1:SWDiagramLink), 2, 1) = ':'">																							<xsl:text>file:///</xsl:text>																						</xsl:if>																						<xsl:value-of select="translate(string(../n1:SWDiagramLink), '&#x5c;', '/')"/>																					</xsl:attribute>																				</xsl:otherwise>																			</xsl:choose>																			<span>																				<xsl:value-of select="substring-after( . ,&apos;/&apos;)"/>																			</span>																		</a>																	</xsl:for-each>																</xsl:when>																<xsl:otherwise>																	<xsl:for-each select="n1:SWName">																		<a>																			<xsl:choose>																				<xsl:when test="not(string(concat(&apos;#&apos;,../n1:SWDiagramLink)))">																					<xsl:attribute name="href">																						<xsl:text>#</xsl:text>																					</xsl:attribute>																				</xsl:when>																				<xsl:when test="substring(string(concat(&apos;#&apos;,../n1:SWDiagramLink)), 1, 1) = '#'">																					<xsl:attribute name="href">																						<xsl:value-of select="concat(&apos;#&apos;,../n1:SWDiagramLink)"/>																					</xsl:attribute>																				</xsl:when>																				<xsl:otherwise>																					<xsl:attribute name="href">																						<xsl:if test="substring(string(concat(&apos;#&apos;,../n1:SWDiagramLink)), 2, 1) = ':'">																							<xsl:text>file:///</xsl:text>																						</xsl:if>																						<xsl:value-of select="translate(string(concat(&apos;#&apos;,../n1:SWDiagramLink)), '&#x5c;', '/')"/>																					</xsl:attribute>																				</xsl:otherwise>																			</xsl:choose>																			<xsl:apply-templates/>																		</a>																	</xsl:for-each>																	<span>																		<xsl:text>&#160;</xsl:text>																	</span>																</xsl:otherwise>															</xsl:choose>														</xsl:otherwise>													</xsl:choose>												</td>												<td class="td">													<xsl:for-each select="n1:SWDescriptionNotes">														<xsl:for-each select="n1:SWDescription">															<xsl:apply-templates/>														</xsl:for-each>													</xsl:for-each>												</td>												<td class="td">													<xsl:for-each select="n1:SWDescriptionNotes">														<xsl:for-each select="n1:SWNotes">															<xsl:apply-templates/>														</xsl:for-each>													</xsl:for-each>												</td>												<td class="td">													<xsl:for-each select="n1:SWObjects">														<xsl:for-each select="n1:SWObject">															<xsl:for-each select="n1:SWObjectName">																<a>																	<xsl:choose>																		<xsl:when test="not(string(concat(&apos;#&apos;,../n1:SWObjectLink)))">																			<xsl:attribute name="href">																				<xsl:text>#</xsl:text>																			</xsl:attribute>																		</xsl:when>																		<xsl:when test="substring(string(concat(&apos;#&apos;,../n1:SWObjectLink)), 1, 1) = '#'">																			<xsl:attribute name="href">																				<xsl:value-of select="concat(&apos;#&apos;,../n1:SWObjectLink)"/>																			</xsl:attribute>																		</xsl:when>																		<xsl:otherwise>																			<xsl:attribute name="href">																				<xsl:if test="substring(string(concat(&apos;#&apos;,../n1:SWObjectLink)), 2, 1) = ':'">																					<xsl:text>file:///</xsl:text>																				</xsl:if>																				<xsl:value-of select="translate(string(concat(&apos;#&apos;,../n1:SWObjectLink)), '&#x5c;', '/')"/>																			</xsl:attribute>																		</xsl:otherwise>																	</xsl:choose>																	<xsl:apply-templates/>																</a>																<br/>															</xsl:for-each>														</xsl:for-each>													</xsl:for-each>												</td>											</tr>										</xsl:for-each>									</xsl:for-each>								</tbody>							</table>						</xsl:if>						<xsl:for-each select="n1:TablesViewsCollection">							<xsl:for-each select="n1:TableViewDetails">								<xsl:if test="../../n1:UsePageBreaks = &apos;true&apos;">									<br class="altova-page-break" clear="all"/>								</xsl:if>								<p>									<span>										<xsl:text>&#160;</xsl:text>									</span>								</p>								<table class="w_16">									<xsl:variable name="altova:CurrContextGrid_2" select="."/>									<tbody>										<tr>											<td class="td_h_v w_4">												<span>													<xsl:text>View Name</xsl:text>												</span>											</td>											<td class="td obj_name w_12">												<xsl:choose>													<xsl:when test="$SV_OutputFormat = &apos;HTML&apos;">														<xsl:choose>															<xsl:when test="n1:DiagramSuffix != &apos;&apos;">																<xsl:element name="a">																	<xsl:attribute name="href">																		<xsl:value-of select="concat('#' , n1:EncodedViewName , n1:DiagramSuffix)"/>																	</xsl:attribute>																	<xsl:attribute name="name">																		<xsl:value-of select="n1:ViewName"/>																	</xsl:attribute>																	<xsl:for-each select="n1:ViewName">																		<xsl:apply-templates/>																	</xsl:for-each>																</xsl:element>															</xsl:when>															<xsl:otherwise>																<a>																	<xsl:attribute name="name">																		<xsl:value-of select="n1:ViewName"/>																	</xsl:attribute>																	<xsl:for-each select="n1:ViewName">																		<xsl:apply-templates/>																	</xsl:for-each>																</a>															</xsl:otherwise>														</xsl:choose>													</xsl:when>													<xsl:otherwise>														<a>															<xsl:attribute name="name">																<xsl:value-of select="n1:ViewName"/>															</xsl:attribute>															<xsl:for-each select="n1:ViewName">																<xsl:apply-templates/>															</xsl:for-each>														</a>													</xsl:otherwise>												</xsl:choose>											</td>										</tr>										<xsl:choose>											<xsl:when test="n1:StructuredTypeName != &apos;&apos;">												<tr>													<td class="td_h_v">														<span>															<xsl:text>Structured Type</xsl:text>														</span>													</td>													<td class="td">														<xsl:for-each select="n1:StructuredTypeName">															<xsl:apply-templates/>														</xsl:for-each>													</td>												</tr>											</xsl:when>											<xsl:otherwise/>										</xsl:choose>										<xsl:choose>											<xsl:when test="n1:SelectStatement != &apos;&apos;">												<tr>													<td class="td_h_v">														<span>															<xsl:text>Select Statement</xsl:text>														</span>													</td>													<td class="td">														<xsl:for-each select="n1:SelectStatement">															<xsl:apply-templates/>														</xsl:for-each>													</td>												</tr>											</xsl:when>											<xsl:otherwise/>										</xsl:choose>									</tbody>								</table>								<xsl:if test="count( n1:DescriptionNotes )">									<p/>									<xsl:for-each select="n1:DescriptionNotes">										<table class="w_16">											<xsl:variable name="altova:CurrContextGrid_3" select="."/>											<tbody>												<tr>													<td class="td_h_v w_4">														<span>															<xsl:text>Description</xsl:text>														</span>													</td>													<td class="td w_11p5">														<xsl:for-each select="n1:Description">															<xsl:apply-templates/>														</xsl:for-each>													</td>												</tr>												<tr>													<td class="td_h_v">														<span>															<xsl:text>Notes</xsl:text>														</span>													</td>													<td class="td">														<xsl:for-each select="n1:Notes">															<xsl:apply-templates/>														</xsl:for-each>													</td>												</tr>											</tbody>										</table>									</xsl:for-each>								</xsl:if>								<xsl:if test="count( n1:DiagramsCollection)">									<p/>									<span class="t_cap">										<xsl:text>Used In Diagrams</xsl:text>									</span>									<br/>									<table class="w_8">										<xsl:variable name="altova:CurrContextGrid_4" select="."/>										<tbody>											<tr>												<td class="td_h_h w_8">													<span>														<xsl:text>Diagram Name</xsl:text>													</span>												</td>											</tr>											<xsl:for-each select="n1:DiagramsCollection">												<xsl:variable name="tName" select="../n1:ViewName"/>												<xsl:variable name="vEncodedViewName" select="../n1:EncodedViewName"/>												<xsl:for-each select="n1:Diagram">													<xsl:variable name="dSuffix" select="n1:Suffix"/>													<tr>														<td class="td">															<xsl:choose>																<xsl:when test="$SV_OutputFormat = &apos;HTML&apos;">																	<xsl:choose>																		<xsl:when test="n1:Suffix != &apos;&apos;">																			<xsl:for-each select="n1:Name">																				<xsl:element name="a">																					<xsl:attribute name="href">																						<xsl:value-of select="concat('#' , $vEncodedViewName , $dSuffix)"/>																					</xsl:attribute>																					<xsl:attribute name="name">																						<xsl:value-of select="$tName"/>																					</xsl:attribute>																					<span>																						<xsl:value-of select="substring-after( . ,&apos;/&apos;)"/>																					</span>																				</xsl:element>																			</xsl:for-each>																		</xsl:when>																		<xsl:otherwise>																			<xsl:for-each select="n1:Name">																				<a>																					<xsl:choose>																						<xsl:when test="not(string(../n1:Link))">																							<xsl:attribute name="href">																								<xsl:text>#</xsl:text>																							</xsl:attribute>																						</xsl:when>																						<xsl:when test="substring(string(../n1:Link), 1, 1) = '#'">																							<xsl:attribute name="href">																								<xsl:value-of select="../n1:Link"/>																							</xsl:attribute>																						</xsl:when>																						<xsl:otherwise>																							<xsl:attribute name="href">																								<xsl:if test="substring(string(../n1:Link), 2, 1) = ':'">																									<xsl:text>file:///</xsl:text>																								</xsl:if>																								<xsl:value-of select="translate(string(../n1:Link), '&#x5c;', '/')"/>																							</xsl:attribute>																						</xsl:otherwise>																					</xsl:choose>																					<span>																						<xsl:value-of select="substring-after( . ,&apos;/&apos;)"/>																					</span>																				</a>																			</xsl:for-each>																		</xsl:otherwise>																	</xsl:choose>																</xsl:when>																<xsl:otherwise>																	<xsl:choose>																		<xsl:when test="contains( . ,  &apos;.pdf&apos; )">																			<xsl:for-each select="n1:Name">																				<a>																					<xsl:choose>																						<xsl:when test="not(string(concat(&apos;./&apos;,../n1:Link)))">																							<xsl:attribute name="href">																								<xsl:text>#</xsl:text>																							</xsl:attribute>																						</xsl:when>																						<xsl:when test="substring(string(concat(&apos;./&apos;,../n1:Link)), 1, 1) = '#'">																							<xsl:attribute name="href">																								<xsl:value-of select="concat(&apos;./&apos;,../n1:Link)"/>																							</xsl:attribute>																						</xsl:when>																						<xsl:otherwise>																							<xsl:attribute name="href">																								<xsl:if test="substring(string(concat(&apos;./&apos;,../n1:Link)), 2, 1) = ':'">																									<xsl:text>file:///</xsl:text>																								</xsl:if>																								<xsl:value-of select="translate(string(concat(&apos;./&apos;,../n1:Link)), '&#x5c;', '/')"/>																							</xsl:attribute>																						</xsl:otherwise>																					</xsl:choose>																					<span>																						<xsl:value-of select="substring-after( . ,&apos;/&apos;)"/>																					</span>																				</a>																			</xsl:for-each>																		</xsl:when>																		<xsl:otherwise>																			<xsl:for-each select="n1:Name">																				<a>																					<xsl:choose>																						<xsl:when test="not(string(concat(&apos;#&apos;, ../../../n1:EncodedViewName, ../n1:Suffix)))">																							<xsl:attribute name="href">																								<xsl:text>#</xsl:text>																							</xsl:attribute>																						</xsl:when>																						<xsl:when test="substring(string(concat(&apos;#&apos;, ../../../n1:EncodedViewName, ../n1:Suffix)), 1, 1) = '#'">																							<xsl:attribute name="href">																								<xsl:value-of select="concat(&apos;#&apos;, ../../../n1:EncodedViewName, ../n1:Suffix)"/>																							</xsl:attribute>																						</xsl:when>																						<xsl:otherwise>																							<xsl:attribute name="href">																								<xsl:if test="substring(string(concat(&apos;#&apos;, ../../../n1:EncodedViewName, ../n1:Suffix)), 2, 1) = ':'">																									<xsl:text>file:///</xsl:text>																								</xsl:if>																								<xsl:value-of select="translate(string(concat(&apos;#&apos;, ../../../n1:EncodedViewName, ../n1:Suffix)), '&#x5c;', '/')"/>																							</xsl:attribute>																						</xsl:otherwise>																					</xsl:choose>																					<span>																						<xsl:value-of select="substring-after( . ,&apos;/&apos;)"/>																					</span>																				</a>																			</xsl:for-each>																		</xsl:otherwise>																	</xsl:choose>																</xsl:otherwise>															</xsl:choose>														</td>													</tr>												</xsl:for-each>											</xsl:for-each>										</tbody>									</table>								</xsl:if>								<xsl:if test="count( n1:ColumnsCollection )">									<p/>									<span class="t_cap">										<xsl:text>Columns</xsl:text>									</span>									<table class="w_25">										<xsl:variable name="altova:CurrContextGrid_5" select="."/>										<thead>											<tr>												<th class="td_h_h w_1">													<span>														<xsl:text>No</xsl:text>													</span>												</th>												<th class="td_h_h w_14">													<span>														<xsl:text>Column Name</xsl:text>													</span>												</th>												<th class="td_h_h w_1">													<span>														<xsl:text>PK</xsl:text>													</span>												</th>												<th class="td_h_h w_1">													<span>														<xsl:text>FK</xsl:text>													</span>												</th>												<th class="td_h_h w_1">													<span>														<xsl:text>M</xsl:text>													</span>												</th>												<th class="td_h_h  w_4">													<span>														<xsl:text>Data Type</xsl:text>													</span>												</th>												<th class="td_h_h w_3">													<span>														<xsl:text>Security</xsl:text>													</span>												</th>											</tr>										</thead>										<tbody>											<xsl:for-each select="n1:ColumnsCollection">												<xsl:for-each select="n1:ColumnDetails">													<tr>														<td class="td_r">															<xsl:for-each select="n1:Sequence">																<xsl:apply-templates/>															</xsl:for-each>														</td>														<td class="td">															<xsl:for-each select="n1:ColumnName">																<xsl:apply-templates/>															</xsl:for-each>														</td>														<td class="td_c">															<xsl:for-each select="n1:PK">																<xsl:apply-templates/>															</xsl:for-each>														</td>														<td class="td_c">															<xsl:for-each select="n1:FK">																<xsl:apply-templates/>															</xsl:for-each>														</td>														<td class="td_c">															<xsl:for-each select="n1:M">																<xsl:apply-templates/>															</xsl:for-each>														</td>														<td class="td">															<xsl:for-each select="n1:DataType">																<xsl:apply-templates/>															</xsl:for-each>														</td>														<td class="td">															<xsl:for-each select="n1:Security">																<xsl:apply-templates/>															</xsl:for-each>														</td>													</tr>												</xsl:for-each>											</xsl:for-each>										</tbody>									</table>								</xsl:if>								<xsl:if test="count( n1:ColumnsCommentsCollection )">									<p/>									<span class="t_cap">										<xsl:text>Columns Comments</xsl:text>									</span>									<table class="w_25">										<xsl:variable name="altova:CurrContextGrid_6" select="."/>										<thead>											<tr>												<th class="td_h_h w_1">													<span>														<xsl:text>No</xsl:text>													</span>												</th>												<th class="td_h_h w_6">													<span>														<xsl:text>Column Name</xsl:text>													</span>												</th>												<th class="td_h_h  w_9">													<span>														<xsl:text>Description</xsl:text>													</span>												</th>												<th class="td_h_h w_9">													<span>														<xsl:text>Notes</xsl:text>													</span>												</th>											</tr>										</thead>										<tbody>											<xsl:for-each select="n1:ColumnsCommentsCollection">												<xsl:for-each select="n1:ColumnCommentsDetails">													<tr>														<td class="td_r">															<xsl:for-each select="n1:ColumnCommentsSequence">																<xsl:apply-templates/>															</xsl:for-each>														</td>														<td class="td">															<xsl:for-each select="n1:ColumnCommentsName">																<xsl:apply-templates/>															</xsl:for-each>														</td>														<td class="td">															<xsl:for-each select="n1:ColumnDescription">																<xsl:apply-templates/>																<br/>															</xsl:for-each>														</td>														<td class="td">															<xsl:for-each select="n1:ColumnNotes">																<xsl:apply-templates/>																<br/>															</xsl:for-each>														</td>													</tr>												</xsl:for-each>											</xsl:for-each>										</tbody>									</table>								</xsl:if>								<xsl:if test="count( n1:FKRTCollection )">									<p/>									<span class="t_cap">										<xsl:text>Foreign Keys (referring to)</xsl:text>									</span>									<table class="w_25">										<xsl:variable name="altova:CurrContextGrid_7" select="."/>										<thead>											<tr>												<th class="td_h_h w_6">													<span>														<xsl:text>Name</xsl:text>													</span>												</th>												<th class="td_h_h w_5">													<span>														<xsl:text>Refering To</xsl:text>													</span>												</th>												<th class="td_h_h w_1p5">													<span>														<xsl:text>Mandatory</xsl:text>													</span>												</th>												<th class="td_h_h w_1p5">													<span>														<xsl:text>Transferable</xsl:text>													</span>												</th>												<th class="td_h_h w_1">													<span>														<xsl:text>In Arc</xsl:text>													</span>												</th>												<th class="td_h_h w_4">													<span>														<xsl:text>Columns</xsl:text>													</span>												</th>												<th class="td_h_h w_4">													<span>														<xsl:text>Referred Columns</xsl:text>													</span>												</th>												<th class="td_h_h w_2">													<span>														<xsl:text>Delete Rule</xsl:text>													</span>												</th>											</tr>										</thead>										<tbody>											<xsl:for-each select="n1:FKRTCollection">												<xsl:for-each select="n1:FKRTDetails">													<tr>														<td class="td">															<xsl:for-each select="n1:FKName">																<xsl:apply-templates/>															</xsl:for-each>														</td>														<td class="td">															<xsl:for-each select="n1:FKReferringTo">																<xsl:apply-templates/>															</xsl:for-each>														</td>														<td class="td_c">															<xsl:for-each select="n1:FKMandatory">																<xsl:apply-templates/>															</xsl:for-each>														</td>														<td class="td_c">															<xsl:for-each select="n1:FKTransferable">																<xsl:apply-templates/>															</xsl:for-each>														</td>														<td class="td_c">															<xsl:for-each select="n1:FKInArc">																<xsl:apply-templates/>															</xsl:for-each>														</td>														<td class="td">															<xsl:for-each select="n1:FKReferringColumnName">																<xsl:apply-templates/>															</xsl:for-each>														</td>														<td class="td">															<xsl:for-each select="n1:FKReferredColumnName">																<xsl:apply-templates/>															</xsl:for-each>														</td>														<td class="td_c">															<xsl:for-each select="n1:FKDeleteRule">																<xsl:apply-templates/>															</xsl:for-each>														</td>													</tr>												</xsl:for-each>											</xsl:for-each>										</tbody>									</table>								</xsl:if>								<xsl:if test="count( n1:FKRFCollection )">									<p/>									<span class="t_cap">										<xsl:text>Foreign Keys (referred from)</xsl:text>									</span>									<table class="w_25">										<xsl:variable name="altova:CurrContextGrid_8" select="."/>										<thead>											<tr>												<th class="td_h_h w_6">													<span>														<xsl:text>Name</xsl:text>													</span>												</th>												<th class="td_h_h w_5">													<span>														<xsl:text>Referred From</xsl:text>													</span>												</th>												<th class="td_h_h w_1p5">													<span>														<xsl:text>Mandatory</xsl:text>													</span>												</th>												<th class="td_h_h w_1p5">													<span>														<xsl:text>Transferable</xsl:text>													</span>												</th>												<th class="td_h_h w_1">													<span>														<xsl:text>In Arc</xsl:text>													</span>												</th>												<th class="td_h_h w_4">													<span>														<xsl:text>Columns</xsl:text>													</span>												</th>												<th class="td_h_h w_4">													<span>														<xsl:text>Referred Columns</xsl:text>													</span>												</th>												<th class="td_h_h w_2">													<span>														<xsl:text>Delete Rule</xsl:text>													</span>												</th>											</tr>										</thead>										<tbody>											<xsl:for-each select="n1:FKRFCollection">												<xsl:for-each select="n1:FKRFDetails">													<tr>														<td class="td">															<xsl:for-each select="n1:FKName">																<xsl:apply-templates/>															</xsl:for-each>														</td>														<td class="td">															<xsl:for-each select="n1:FKReferredFrom">																<xsl:apply-templates/>															</xsl:for-each>														</td>														<td class="td_c">															<xsl:for-each select="n1:FKMandatory">																<xsl:apply-templates/>															</xsl:for-each>														</td>														<td class="td_c">															<xsl:for-each select="n1:FKTransferable">																<xsl:apply-templates/>															</xsl:for-each>														</td>														<td class="td_c">															<xsl:for-each select="n1:FKInArc">																<xsl:apply-templates/>															</xsl:for-each>														</td>														<td class="td">															<xsl:for-each select="n1:FKReferredColumnName">																<xsl:apply-templates/>															</xsl:for-each>														</td>														<td class="td">															<xsl:for-each select="n1:FKReferringColumnName">																<xsl:apply-templates/>															</xsl:for-each>														</td>														<td class="td_c">															<xsl:for-each select="n1:FKDeleteRule">																<xsl:apply-templates/>															</xsl:for-each>														</td>													</tr>												</xsl:for-each>											</xsl:for-each>										</tbody>									</table>								</xsl:if>							</xsl:for-each>						</xsl:for-each>					</xsl:for-each>				</xsl:for-each>			</body>		</html>	</xsl:template></xsl:stylesheet>